(function ($) {
    function onKeyDown(event){
        var e = event || window.event || arguments.callee.caller.arguments[0];
        if(e && e.keyCode==27){ // 按 Esc
        }
        if(e && e.keyCode==113){ // 按 F2
        }
        if(e && e.keyCode==13){ // enter 键
            alert("此处回车触发搜索事件");
        }
    }
})(jQuery);