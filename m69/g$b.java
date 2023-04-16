package m69.g$b;
import erd.o;
import m69.g;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import l69.n;
import l69.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.c;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h69.g;
import q87.c;
import java.lang.Boolean;
import brd.t;
import tkd.b;
import tkd.d;
import kob.i;

public final class g$b implements o	// class@002e18
{
    public final g b;
    public final String c;
    public final boolean d;
    public final double e;
    public final double f;
    public final double g;

    public void g$b(g p0,String p1,boolean p2,double p3,double p4,double p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public Object apply(Object p0){
       AICutStyle mLyricStyleI;
       Object[] objArray;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(obj1, obj, g$b.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(obj1, "realMusic");
          o oo = n.f.d();
          String str = "";
          if (oo != null) {
             VideoTemplateProject videoTemplat = oo.b();
             if (videoTemplat != null) {
                AICutStyle uAICutStyle = PatchProxy.apply(null, videoTemplat, c.class, "27");
                if (uAICutStyle != patchProxyRe) {
                }else {
                   uAICutStyle = videoTemplat.I(videoTemplat.p);
                }
                if (uAICutStyle != null) {
                   mLyricStyleI = uAICutStyle.mLyricStyleId;
                   if (mLyricStyleI != null) {
                   label_0047 :
                      int i = 0;
                      String str1 = "KwaiAICutConfig";
                      if (!TextUtils.n(mLyricStyleI, obj.c)) {
                         objArray = new Object[i];
                         g.D().w(str1, "it is not expected style id", objArray);
                         ot = t.just(Boolean.FALSE);
                      }else {
                         Music mMmuLyrics = obj1.mMmuLyrics;
                         Music music = (mMmuLyrics != null)? mMmuLyrics: str;
                         if (TextUtils.x(obj.c)) {
                            if (obj.d != null) {
                               objArray = new Object[i];
                               g.D().A(str1, "from entrance, musicLyricFile or lyricStyleId is empty", objArray);
                               ot = t.just(Boolean.FALSE);
                            }else {
                               ot = obj.b.J0(obj.c, obj.e, obj.f);
                            }
                         }else if(TextUtils.x(music)){
                            ot = obj.b.J0(obj.c, obj.e, obj.f);
                         }else {
                            double d = (double)obj1.mChorus / (double)1000.00f;
                            d.a(0x2be267d).iR(obj.c, obj.e, obj.f, music, d, obj.g, ((double)obj1.mDuration - d));
                            ot = t.just(Boolean.TRUE);
                         }
                      }
                   }
                }
             }
          }
          mLyricStyleI = str;
          goto label_0047 ;
       }
       return ot;
    }
}
