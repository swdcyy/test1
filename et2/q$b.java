package et2.q$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.VoicePartyHatConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import va1.e0;
import java.util.Collection;
import java.util.Iterator;
import s0d.f;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import et2.q$b$a;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;

public class q$b implements Runnable	// class@0027e5
{

    public void q$b(){
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q$b.class, "1")) {
          return;
       }
       ArrayList uArrayList = PatchProxy.apply(objArray, this, q$b.class, "2");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          ArrayList uArrayList1 = new ArrayList();
          if (liveVoicePar != null) {
             LiveVoicePartyCommonConfig mVoicePartyH = liveVoicePar.mVoicePartyHatConfig;
             if (mVoicePartyH != null) {
                VoicePartyHatConfig mMale = mVoicePartyH.mMale;
                if (mMale != null) {
                   uArrayList1.addAll(e0.a(mMale, CDNUrl[].class));
                }
                mMale = liveVoicePar.mVoicePartyHatConfig.mFemale;
                if (mMale != null) {
                   uArrayList1.addAll(e0.a(mMale, CDNUrl[].class));
                }
                VoicePartyHatConfig mBehindHatUr = liveVoicePar.mVoicePartyHatConfig.mBehindHatUrls;
                if (mBehindHatUr != null) {
                   uArrayList1.add(mBehindHatUr);
                }
             }
          }
          uArrayList = uArrayList1;
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          e[] uoeArray = f.x().r(iterator.next()).w();
          int len = uoeArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uoeArray[i];
             c uoc = Fresco.getImagePipeline().isInDiskCache(oobject);
             q$b$a uob$a = new q$b$a(this, oobject);
             uoc.f(uob$a, AsyncTask.THREAD_POOL_EXECUTOR);
          }
       }
       return;
    }
}
