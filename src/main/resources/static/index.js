window.onload = function() {
    $(".remove-btn").click((e) => {
        e.currentTarget.closest('.content-wrapper').remove();
        var btn = $(e.currentTarget);
        var purchaseID = btn.attr("data-delete-id");
        $.post("/purchase/" + purchaseID + "/delete", () => {});
    });

    $(".checkbox").click((e) => {
        var btn = $(e.currentTarget);
        var purchaseID = btn.attr("data-purchase-id");
        btn.attr("disabled", "disabled");
        $.post("/purchase/" + purchaseID + "/bought", () => {});
    });
};

