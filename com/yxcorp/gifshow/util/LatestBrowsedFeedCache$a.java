package com.yxcorp.gifshow.util.LatestBrowsedFeedCache$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$Operation;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LatestBrowsedFeedCache$a	// class@001ef2
{
    public final QPhoto a;
    public final LatestBrowsedFeedCache$Operation b;

    public void LatestBrowsedFeedCache$a(QPhoto p0,LatestBrowsedFeedCache$Operation p1){
       a.p(p1, "operation");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final LatestBrowsedFeedCache$Operation a(){
       return this.b;
    }
    public final QPhoto b(){
       return this.a;
    }
}
