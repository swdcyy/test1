package com.yxcorp.gifshow.photoad.game.c;
import yka.c;
import com.yxcorp.gifshow.photoad.e;
import java.lang.Object;
import yka.b;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import oxb.d;
import z1.a;
import oxb.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oxb.i;
import com.yxcorp.gifshow.photoad.game.b;
import oxb.h;
import oxb.f;
import oxb.g;
import com.yxcorp.gifshow.photoad.game.a;

public class c implements c	// class@000f91
{
    public final e[] a;

    public void c(e[] p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return b.b(this);
    }
    public boolean b(){
       return b.a(this);
    }
    public void c(GameCenterDownloadParams$DownloadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
       Objects.requireNonNull(mStage);
       int i = -1;
       switch (mStage.hashCode()){
           case 0xae7a2e7a:
             if (mStage.equals("cancel")) {
                i = 0;
             }
             break;
           case 0xc454c22d:
             if (mStage.equals("progress")) {
                i = 1;
             }
             break;
           case 0xc84dc82d:
             if (mStage.equals("resume")) {
                i = 2;
             }
             break;
           case 0xdc453139:
             if (mStage.equals("complete")) {
                i = 3;
             }
             break;
           case 0x5c4d208:
             if (mStage.equals("error")) {
                i = 4;
             }
             break;
           case 0x65825f6:
             if (mStage.equals("pause")) {
                i = 5;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.d(a.a);
             break;
           case 1:
             this.d(new f(p0));
             this.d(new g(p0));
             break;
           case 2:
             this.d(new h(p0));
             break;
           case 3:
             this.d(b.a);
             break;
           case 4:
             this.d(new e(p0));
             String str = (TextUtils.x(p0.mMsg))? "download error": p0.mMsg;
             this.d(new i(str));
             break;
           case 5:
             this.d(new d(p0));
             break;
           default:
       }
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          int len = ta.length;
          for (int i = 0; i < len; i = i + 1) {
             p0.accept(ta[i]);
          }
       }
       return;
    }
}
