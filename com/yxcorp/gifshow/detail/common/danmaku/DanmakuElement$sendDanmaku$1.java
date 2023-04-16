package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$sendDanmaku$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class DanmakuElement$sendDanmaku$1 extends Lambda implements a	// class@0013ec
{
    public final String $roleKey;
    public final CharSequence $text;
    public final DanmakuElement this$0;

    public void DanmakuElement$sendDanmaku$1(DanmakuElement p0,CharSequence p1,String p2){
       this.this$0 = p0;
       this.$text = p1;
       this.$roleKey = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$sendDanmaku$1.class, "1")) {
          return;
       }
       this.this$0.F0(this.$text, this.$roleKey);
       return;
    }
}
