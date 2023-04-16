package com.kwai.feature.api.social.reminder.push.SocialPushKt$c;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Boolean;
import crd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.yxcorp.gifshow.helper.h;
import wkd.b;
import sx5.d;
import kotlin.jvm.internal.a;
import brd.t;

public final class SocialPushKt$c implements g	// class@0011c3
{
    public final Ref$ObjectRef b;
    public final Boolean c;
    public final a d;
    public final String e;
    public final String f;

    public void SocialPushKt$c(Ref$ObjectRef p0,Boolean p1,a p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialPushKt$c.class, "1")) {
       }else {
          p0 = this.b.element;
          if (p0 != null) {
             p0.dispose();
          }
          if (h.a()) {
             p0 = this.c;
             if (p0 != null) {
                p0.booleanValue();
                if (!(this.c.booleanValue() ^ 0x01)) {
                   p0 = null;
                }
                if (p0 != null) {
                   p0.booleanValue();
                }
             }
             SocialPushKt$c tf = this.f;
             a.m(tf);
             this.d.c(b.a(-159499).b(this.e, tf).subscribe());
          }
       }
       return;
    }
}
