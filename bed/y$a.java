package bed.y$a;
import erd.o;
import bed.y;
import qm6.b$a;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.plugin.search.result.hashtag.entity.ShootParam;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.media.util.c;
import lnc.r5;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.music.utils.o;
import com.kuaishou.android.model.music.MusicType;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import ekd.k1;
import r6b.b;
import e17.i;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import brd.t;

public class y$a implements o	// class@000427
{
    public final int b;
    public final b$a c;
    public final y d;

    public void y$a(y p0,int p1,b$a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       String str;
       Object obj = this;
       File obj1 = p0;
       t ot = PatchProxy.applyOneRefs(obj1, obj, y$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          y$a d = obj.d;
          TagInfo mMusic = d.b.mMusic;
          long l = d.d(obj.b);
          Bitmap uBitmap = null;
          if (obj.d.j(obj.b)) {
             d = obj.d;
             ShootParam mMusicStartT = d.c.mMusicStartTime;
             if (!mMusicStartT - uBitmap || !mMusicStartT - (long)d.b.mMusic.mChorus) {
                str = 1;
             label_0046 :
                long l1 = obj.d.b(mMusic);
                int i = (str)? uBitmap: l1;
                long l2 = (str)? l1: uBitmap;
                l1 = (long)c.i(obj1.getPath());
                String str1 = r5.b().c(o.d(mMusic));
                Music mType = mMusic.mType;
                if (mType == MusicType.SOUNDTRACK || mType == MusicType.LIP) {
                   ot = t.just(obj.d.a(obj.c, mMusic, obj1, l1, 0, 0, str1));
                }else {
                   File uFile = new File(b.a(-1504323719).o(), "audio-"+k1.j()+".mp4");
                   Object obj2 = obj1;
                   long l3 = l1;
                   obj1 = uFile;
                   l1 = i;
                   File uFile1 = uFile;
                   try{
                      long l4 = l;
                      b.g(obj2, l3, obj1, l1, l4);
                   }catch(java.io.IOException e0){
                      i.a(R.style.arg_RES_7f11066a, 0x7f100dd8);
                      uFile1.delete();
                      ExceptionHandler.handleCaughtException(e0);
                   }
                   ot = t.just(obj.d.a(obj.c, mMusic, uFile1, l, i, l2, str1));
                }
             }
          }
          str = null;
          goto label_0046 ;
       }
       return ot;
    }
}
