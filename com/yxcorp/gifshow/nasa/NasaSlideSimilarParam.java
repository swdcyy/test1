package com.yxcorp.gifshow.nasa.NasaSlideSimilarParam;
import com.yxcorp.gifshow.nasa.NasaSlideSimilarParam$b;
import java.lang.Object;
import com.yxcorp.gifshow.nasa.NasaSlideSimilarParam$a;

public class NasaSlideSimilarParam	// class@0020cf
{
    public final SimilarPhotoLocation mFromLocation;
    public final boolean mIsClusterSerial;
    public final boolean mIsDisableSimilarShowCreatedTime;
    public final boolean mIsFromUrl;
    public final boolean mIsRelatedEpisodes;
    public final boolean mIsSimilarShowPhotoIndex;
    public final String mPhotoPage;
    public final String mSerialContext;
    public final String mSerialId;
    public final int mSerialType;
    public final String mSimilarCardsBarTitle;
    public final String mSimilarCardsPanelTitle;

    public void NasaSlideSimilarParam(){
       super(new NasaSlideSimilarParam$b());
    }
    public void NasaSlideSimilarParam(NasaSlideSimilarParam$b p0){
       super();
       this.mFromLocation = p0.a;
       this.mSimilarCardsBarTitle = p0.c;
       this.mSimilarCardsPanelTitle = p0.d;
       this.mIsSimilarShowPhotoIndex = p0.b;
       this.mIsDisableSimilarShowCreatedTime = p0.e;
       this.mIsRelatedEpisodes = p0.f;
       this.mIsFromUrl = p0.g;
       this.mSerialId = p0.i;
       this.mSerialType = p0.j;
       this.mSerialContext = p0.k;
       this.mPhotoPage = p0.l;
       this.mIsClusterSerial = p0.h;
    }
    public void NasaSlideSimilarParam(NasaSlideSimilarParam$b p0,NasaSlideSimilarParam$a p1){
       super(p0);
    }
}
