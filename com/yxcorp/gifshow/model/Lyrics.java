package com.yxcorp.gifshow.model.Lyrics;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;

public class Lyrics implements Serializable	// class@001e45
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
       Lyrics lyrics = new Lyrics();
       lyrics.mArtist = this.mArtist;
       lyrics.mDuration = this.mDuration;
       lyrics.mTitle = this.mTitle;
       lyrics.mOffset = this.mOffset;
       lyrics.mProducer = this.mProducer;
       lyrics.mChorusSungParts = this.mChorusSungParts;
       Iterator iterator = this.mLines.iterator();
       while (iterator.hasNext()) {
          lyrics.mLines.add(iterator.next().deepClone());
       }
       return lyrics;
    }
}
