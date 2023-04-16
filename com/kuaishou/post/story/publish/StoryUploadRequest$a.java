package com.kuaishou.post.story.publish.StoryUploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.lang.Integer;
import gq4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.b;
import com.kuaishou.android.model.music.Music;

public class StoryUploadRequest$a extends UploadRequest$a	// class@000b7d
{
    public a d;

    public void StoryUploadRequest$a(){
       super();
    }
    public UploadRequest a(){
       Object[] objArray = null;
       StoryUploadRequest$a obj = PatchProxy.apply(objArray, this, StoryUploadRequest$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj.t.b == null) {
          AtlasInfo uAtlasInfo = new AtlasInfo();
          uAtlasInfo.mPictureFiles = new ArrayList();
          ArrayList uArrayList = new ArrayList();
          uAtlasInfo.mDonePictures = uArrayList;
          uArrayList.add(this.a.getFilePath());
          if (this.a.getCoverFile() != null) {
             objArray = this.a.getCoverFile().getAbsolutePath();
          }
          uAtlasInfo.setCoverFilePath(objArray);
          uAtlasInfo.mMixedType = 3;
          if (this.d.t.c.intValue() == 2) {
             a d = this.d.e.d;
             if (!TextUtils.x(d) && b.S(new File(d))) {
                uAtlasInfo.mMusicFilePath = d;
                uAtlasInfo.mMusicVolume = this.d.e.b;
             }
             this.y(this.d.e.a());
          }
          this.a.mAtlasInfo = uAtlasInfo;
       }else if(obj.b()){
          obj = this.d;
          if (obj.t.l != null) {
             this.y(obj.e.a());
          }
       }
       return this.a;
    }
}
