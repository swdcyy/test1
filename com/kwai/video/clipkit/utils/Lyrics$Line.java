package com.kwai.video.clipkit.utils.Lyrics$Line;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import com.kwai.video.clipkit.utils.Lyrics$Meta;

public class Lyrics$Line implements Serializable	// class@001af7
{
    public boolean mChorusSung;
    public int mDuration;
    public List mMeta;
    public Lyrics$Singer mSinger;
    public int mStart;
    public String mText;
    public static final long serialVersionUID = 0x98df2c2263776bc7;

    public void Lyrics$Line(){
       super();
       this.mText = "";
       this.mMeta = new ArrayList();
    }
    public Lyrics$Line deepClone(){
       Lyrics$Line obj = PatchProxy.apply(null, this, Lyrics$Line.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Lyrics$Line();
       obj.mStart = this.mStart;
       obj.mDuration = this.mDuration;
       obj.mSinger = this.mSinger;
       obj.mText = this.mText;
       obj.mChorusSung = this.mChorusSung;
       if (this.mMeta != null) {
          obj.mMeta = new ArrayList(this.mMeta.size());
          Iterator iterator = this.mMeta.iterator();
          while (iterator.hasNext()) {
             obj.mMeta.add(iterator.next().deepClone());
          }
       }
       return obj;
    }
}
