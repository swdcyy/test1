package com.kuaishou.android.model.feed.MusicRadioFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.utility.TextUtils;
import yp.o0;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class MusicRadioFeed extends BaseFeed	// class@000b25
{
    public CommonMeta mCommonMeta;
    public Music mRaveView;
    public static final long serialVersionUID = 0x92c1cd336b6a0d66;

    public void MusicRadioFeed(){
       super();
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, MusicRadioFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(this.mRaveView.mId);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicRadioFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MusicRadioFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MusicRadioFeed.class, new o0());
       }else {
          obj.put(MusicRadioFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRadioFeed.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
