package com.kwai.video.clipkit.utils.Lyrics;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.clipkit.utils.Lyrics$Line;

public class Lyrics implements Serializable	// class@001afa
{
    public String mArtist;
    public String mChorusSungParts;
    public int mDuration;
    public List mLines;
    public int mOffset;
    public String mProducer;
    public String mTitle;
    public static final long serialVersionUID = 0xb5c47157c4766289;

    public void Lyrics(){
       super();
       this.mLines = new ArrayList();
       this.mLines = new ArrayList();
    }
    public void Lyrics(Lyrics p0){
       super();
       this.mLines = new ArrayList();
       this.mArtist = p0.mArtist;
       this.mDuration = p0.mDuration;
       this.mOffset = p0.mOffset;
       this.mProducer = p0.mProducer;
       this.mTitle = p0.mTitle;
       this.mLines = new ArrayList(p0.mLines);
    }
    public Lyrics deepClone(){
       Lyrics obj = PatchProxy.apply(null, this, Lyrics.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Lyrics();
       obj.mArtist = this.mArtist;
       obj.mDuration = this.mDuration;
       obj.mTitle = this.mTitle;
       obj.mOffset = this.mOffset;
       obj.mProducer = this.mProducer;
       obj.mChorusSungParts = this.mChorusSungParts;
       Iterator iterator = this.mLines.iterator();
       while (iterator.hasNext()) {
          obj.mLines.add(iterator.next().deepClone());
       }
       return obj;
    }
}
