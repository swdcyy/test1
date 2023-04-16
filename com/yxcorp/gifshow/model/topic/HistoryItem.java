package com.yxcorp.gifshow.model.topic.HistoryItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public abstract class HistoryItem implements Serializable	// class@001fa3
{
    public int mId;
    public String mKeyWord;
    public static final long serialVersionUID = 0xb526b4417cb940bc;

    public void HistoryItem(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof HistoryItem && (this == p0 || this.mId == p0.mId))? true: false;
       return b;
    }
    public int getId(){
       return this.mId;
    }
    public abstract int getItemType();
    public String getKeyWord(){
       return this.mKeyWord;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HistoryItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
    public void setId(int p0){
       this.mId = p0;
    }
    public void setKeyWord(String p0){
       this.mKeyWord = p0;
    }
}
