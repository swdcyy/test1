package com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$2;
import koc.d;
import com.yxcorp.gifshow.notice.krn.m;
import oec.j;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.util.ColorURLSpan;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$2$1;
import android.net.Uri;
import android.content.Context;
import android.text.style.ReplacementSpan;

public class SocialReactTextShadowNode$2 implements d	// class@00219d
{
    public final j a;
    public final m b;

    public void SocialReactTextShadowNode$2(m p0,j p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public ColorURLSpan a(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, SocialReactTextShadowNode$2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       SocialReactTextShadowNode$2$1 u2$1 = new SocialReactTextShadowNode$2$1(this, "", p1, p1);
       u2$1.m(true);
       u2$1.g(this.a.b(Uri.EMPTY));
       u2$1.l(this.a.c(Uri.EMPTY));
       u2$1.d(R.anim.arg_RES_7f010109, 0x7f0100e5);
       u2$1.c(R.anim.arg_RES_7f0100e5, 0x7f010112);
       return u2$1;
    }
    public ReplacementSpan b(Context p0,int p1,int p2){
       return null;
    }
}
