package com.kwai.video.player.mid.manifest.v2.KvqScore;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KvqScore implements Serializable, Cloneable	// class@000b65
{
    public float mFR;
    public float mNR;

    public void KvqScore(){
       super();
    }
    public KvqScore clone(){
       Object obj = PatchProxy.apply(null, this, KvqScore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public float getFR(){
       return this.mFR;
    }
    public float getNR(){
       return this.mNR;
    }
}
