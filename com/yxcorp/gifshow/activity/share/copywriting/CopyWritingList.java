package com.yxcorp.gifshow.activity.share.copywriting.CopyWritingList;
import java.io.Serializable;
import la6.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CopyWritingList implements Serializable, b	// class@00137c
{
    public final List captionRecoList;

    public void CopyWritingList(List p0){
       a.p(p0, "captionRecoList");
       super();
       this.captionRecoList = p0;
    }
    public List getItems(){
       return this.captionRecoList;
    }
    public boolean hasMore(){
       return false;
    }
}
