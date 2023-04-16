package com.yxcorp.gifshow.model.Lyrics$Line;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.Lyrics$Meta;

public class Lyrics$Line implements Serializable	// class@001e42
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
       Lyrics$Line line = new Lyrics$Line();
       line.mStart = this.mStart;
       line.mDuration = this.mDuration;
       line.mSinger = this.mSinger;
       line.mText = this.mText;
       line.mChorusSung = this.mChorusSung;
       if (this.mMeta != null) {
          line.mMeta = new ArrayList(this.mMeta.size());
          Iterator iterator = this.mMeta.iterator();
          while (iterator.hasNext()) {
             line.mMeta.add(iterator.next().deepClone());
          }
       }
       return line;
    }
}
