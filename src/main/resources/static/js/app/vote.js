var main = {
    init : function () {
        var _this = this;

        $('#btn-positive').on('click', function () {
            _this.positive();
        });
        $('#btn-negative').on('click', function () {
            _this.negative();
        });
    },
    positive : function () {
        var data = {
            positive: $('#positive').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/vote/positive',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('투표가 완료되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    negative : function () {
            var data = {
                negative: $('#negative').val()
            };

            $.ajax({
                type: 'POST',
                url: '/api/v1/vote/negative',
                contentType:'application/json; charset=utf-8',
                data: JSON.stringify(data)
            }).done(function() {
                alert('투표가 완료되었습니다.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
        }
};

main.init();