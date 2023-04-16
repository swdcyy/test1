package com.yxcorp.gifshow.album.LocalAlbumParams;
import java.io.Serializable;
import com.yxcorp.gifshow.album.LocalAlbumParams$b;
import java.lang.Object;
import com.yxcorp.gifshow.album.LocalAlbumParams$a;

public final class LocalAlbumParams implements Serializable	// class@0019d0
{
    public int mColumnCount;
    public int mEnableShootVideoTipCount;
    public boolean mNeedFilterAbnormalImport;
    public boolean mNeedReloadOnResume;
    public boolean mNeedShowGroupDivideByTime;
    public boolean mNeedShowHeadView;
    public boolean mNeedShowModifyTime;
    public boolean mNeedShowOptionButton;
    public boolean mNeedShowPublishButtonWhenEmpty;
    public boolean mNeedShowReShootButton;
    public boolean mNeedShowTypeIcon;
    public boolean mNeedWidthHeight34;
    public static final long serialVersionUID = 0xd543ae14fcbec57d;

    public void LocalAlbumParams(LocalAlbumParams$b p0){
       super();
       this.mNeedReloadOnResume = p0.d;
       this.mNeedShowModifyTime = p0.c;
       this.mNeedShowOptionButton = p0.e;
       this.mNeedShowPublishButtonWhenEmpty = p0.f;
       this.mNeedShowHeadView = p0.g;
       this.mNeedShowTypeIcon = p0.b;
       this.mColumnCount = p0.m;
       this.mNeedFilterAbnormalImport = p0.i;
       this.mNeedShowGroupDivideByTime = p0.a;
       this.mNeedShowReShootButton = p0.k;
       this.mNeedWidthHeight34 = p0.j;
       this.mEnableShootVideoTipCount = p0.l;
    }
    public void LocalAlbumParams(LocalAlbumParams$b p0,LocalAlbumParams$a p1){
       super(p0);
    }
    public int getColumnCount(){
       return this.mColumnCount;
    }
    public int getEnableShootVideoTipCount(){
       return this.mEnableShootVideoTipCount;
    }
    public boolean isNeedFilterAbnormalImport(){
       return this.mNeedFilterAbnormalImport;
    }
    public boolean isNeedReloadOnResume(){
       return this.mNeedReloadOnResume;
    }
    public boolean isNeedShowGroupDivideByTime(){
       return this.mNeedShowGroupDivideByTime;
    }
    public boolean isNeedShowHeadView(){
       return this.mNeedShowHeadView;
    }
    public boolean isNeedShowModifyTime(){
       return this.mNeedShowModifyTime;
    }
    public boolean isNeedShowOptionButton(){
       return this.mNeedShowOptionButton;
    }
    public boolean isNeedShowPublishButtonWhenEmpty(){
       return this.mNeedShowPublishButtonWhenEmpty;
    }
    public boolean isNeedShowReShootButton(){
       return this.mNeedShowReShootButton;
    }
    public boolean isNeedShowTypeIcon(){
       return this.mNeedShowTypeIcon;
    }
    public boolean isNeedWidthHeight34(){
       return this.mNeedWidthHeight34;
    }
}
