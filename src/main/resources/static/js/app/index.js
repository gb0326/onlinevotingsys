var main = {
    init : function () {
        var _this = this;

        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () {
            _this.update();
        });

        $('#btn-delete').on('click', function () {
            _this.delete();
        });
    },
    save : function () {
        var data = {
            department: $('#department').val(),
            candidate1: $('#candidate1').val(),
            candidate2: $('#candidate2').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/candidate',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('후보가 등록되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        var data = {
            department: $('#department').val(),
            candidate1: $('#candidate1').val(),
            candidate2: $('#candidate2').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT', /*생성: POST 읽기: GET 수정: PUT 삭제: DELETE*/
            url: '/api/v1/candidate/'+id, /*어느 게시글을 수정할지 URL Path로 구분하기 위해 Path에 id 추가*/
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('수정되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
        alert(JSON.stringify(error));
        });
    },
    delete : function () {
        var id = $('#id').val();

        $.ajax({
            type: 'DELETE',
            url: '/api/v1/candidate/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8'
        }).done(function() {
            alert('삭제되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();