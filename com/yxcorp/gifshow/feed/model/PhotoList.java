package com.yxcorp.gifshow.feed.model.PhotoList;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.feed.model.PhotoQuery;
import com.google.common.collect.ImmutableList;

public final class PhotoList implements Serializable	// class@000ff9
{
    public List mList;
    public static final long serialVersionUID = 0xe880ba6fe0375f04;

    public void PhotoList(List p0){
       super();
       this.mList = p0;
    }
    public void PhotoList(PhotoQuery[] p0){
       super();
       this.mList = ImmutableList.copyOf(p0);
    }
}
