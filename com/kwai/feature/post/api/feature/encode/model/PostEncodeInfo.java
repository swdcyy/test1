package com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import c26.b;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import qk7.a;
import s16.c;
import java.lang.Object;
import s16.d;
import c26.c;
import z30.n0;
import com.kuaishou.edit.draft.Workspace;
import z30.o0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Kuaishan;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Music;

public class PostEncodeInfo extends EncodeInfo	// class@00139c
{
    public c mResult;
    public VideoEncodeSDKInfo mVideoEncodeSDKInfo;
    public Workspace mWorkspace;

    public void PostEncodeInfo(int p0,b p1,VideoEncodeSDKInfo p2,EncodeConfig$ComplexEncodeProfile p3){
       super(p0, p1, p3);
       this.mVideoEncodeSDKInfo = p2;
       this.mResult = p1.get(a.a);
       this.mWorkspace = o0.a(this.mIWorkspace);
    }
    public void PostEncodeInfo(PostEncodeInfo p0){
       super(p0);
       this.mVideoEncodeSDKInfo = p0.mVideoEncodeSDKInfo;
       this.mResult = p0.mResult;
       this.mWorkspace = o0.a(this.mIWorkspace);
    }
    public boolean isAtlas(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.ATLAS)? true: false;
       return b;
    }
    public boolean isIntelligenceAlbum(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Workspace$Type aLBUM_MOVIE = Workspace$Type.ALBUM_MOVIE;
       if (obj.getType() != aLBUM_MOVIE || (this.mWorkspace.getSource() != Workspace$Source.ANNUAL_ALBUM_MOVIE || this.mWorkspace.getTypeFrom() == aLBUM_MOVIE)) {
          b = true;
       }
       return b;
    }
    public boolean isKtvMultiPicSong(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = true;
       if (obj == null || (obj.getType() != Workspace$Type.KTV_SONG || this.mWorkspace.getAssetsCount() <= b)) {
          b = false;
       }
       return b;
    }
    public boolean isKtvMv(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.KTV_MV)? true: false;
       return b;
    }
    public boolean isKtvSinglePicSong(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = true;
       if (obj == null || (obj.getType() != Workspace$Type.KTV_SONG || this.mWorkspace.getAssetsCount() != b)) {
          b = false;
       }
       return b;
    }
    public boolean isKtvSong(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.KTV_SONG)? true: false;
       return b;
    }
    public boolean isKuaiShan(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && (obj.getKuaishan() != null && this.mWorkspace.getKuaishan().hasFeatureId()))? true: false;
       return b;
    }
    public boolean isLongPicture(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.LONG_PICTURE)? true: false;
       return b;
    }
    public boolean isLongVideo(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.LONG_VIDEO)? true: false;
       return b;
    }
    public boolean isMediaScene(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getSource() == Workspace$Source.MEDIA_SCENE)? true: false;
       return b;
    }
    public boolean isNeedIncreaseFps(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = true;
       if (obj != null) {
          Workspace$Source source = obj.getSource();
          obj = (source == Workspace$Source.IMPORT_MIXED || source == Workspace$Source.VIDEO_SOLITAIRE)? 1: null;
          if (!obj && (this.mWorkspace.getType() == Workspace$Type.AI_CUT || this.mWorkspace.getType() == Workspace$Type.ALBUM_MOVIE)) {
          label_0042 :
             return b;
          }
       }
       b = false;
       goto label_0042 ;
    }
    public boolean isNormalPhotoMovie(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = false;
       obj = (obj == null || (!obj.getAiCutThemesCount() && !this.mWorkspace.hasKuaishan()))? 1: 0;
       if (this.mIsPhotoMovie != null && obj) {
          b = true;
       }
       return b;
    }
    public boolean isSinglePicture(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public boolean isVideo(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj == null || (obj.getType() == Workspace$Type.VIDEO || this.isLongVideo()))? true: false;
       return b;
    }
    public void setWorkspace(Workspace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostEncodeInfo.class, "1")) {
          return;
       }
       this.mIWorkspace = o0.b(p0);
       this.mWorkspace = p0;
       return;
    }
    public boolean useTemplateGrade(){
       Object obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mWorkspace != null && (!this.isKuaiShan() && (this.mWorkspace.getSource() == Workspace$Source.ANNUAL_ALBUM_2022 || this.mWorkspace.getSource() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL)))? true: false;
       return b;
    }
    public boolean usedBeatSync(){
       PostEncodeInfo obj = PatchProxy.apply(null, this, PostEncodeInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       if (obj != null && obj.getMusicsList() != null) {
          Iterator iterator = this.mWorkspace.getMusicsList().iterator();
          while (iterator.hasNext()) {
             if (iterator.next().getTransPointsCount() > 0) {
                return true;
             }
          }
       }
       return false;
    }
}
