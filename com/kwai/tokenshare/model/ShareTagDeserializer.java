package com.kwai.tokenshare.model.ShareTagDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
import com.google.gson.JsonObject;
import ekd.k0;
import com.kwai.tokenshare.model.a;
import el.a;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collections;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.android.model.music.Music;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.mix.Location;

public class ShareTagDeserializer implements b	// class@000f80
{

    public void ShareTagDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       String this;
       Music music;
       Location location;
       TokenDialogModel$ShareTag shareTag = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareTagDeserializer.class, "2");
       if (shareTag != PatchProxyResult.class) {
       }else {
          shareTag = new TokenDialogModel$ShareTag();
          String str = "photos";
          if (k0.a(p0, str)) {
             LinkedList linkedList = new LinkedList();
             Iterator iterator = p2.c(k0.e(p0, str), new a(this).getType()).iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                if (qPhoto != null) {
                   linkedList.add(qPhoto.getCoverThumbnailUrls());
                }
             }
             shareTag.mPhotoCovers = linkedList;
          }else {
             shareTag.mPhotoCovers = Collections.emptyList();
          }
          String str1 = "";
          shareTag.mType = k0.h(p0, "tagType", str1);
          str = "photoCount";
          int i = 0;
          if (k0.a(p0, str)) {
             shareTag.mPhotoCount = k0.f(p0, str, i);
          }
          str = "tag";
          if (k0.a(p0, str)) {
             p0 = k0.e(p0, str);
             if (p0 != null && p0 instanceof JsonObject) {
                String str2 = "id";
                this = "name";
                if (TextUtils.n("text", shareTag.mType)) {
                   shareTag.mTagType = 1;
                   shareTag.mTagName = k0.h(p0, this, str1);
                   shareTag.mIsRich = k0.c(p0, "rich", i);
                   shareTag.mId = k0.h(p0, str2, str1);
                }else if(TextUtils.n("mmu", shareTag.mType)){
                   shareTag.mTagType = 2;
                   shareTag.mTagName = k0.h(p0, this, str1);
                   shareTag.mId = k0.h(p0, str2, str1);
                }else if(TextUtils.n("music", shareTag.mType)){
                   shareTag.mTagType = 3;
                   music = a.a.c(p0, Music.class);
                   Music mName = (music != null)? music.mName: str1;
                   shareTag.mTagName = mName;
                   if (music != null) {
                      str1 = music.mId;
                   }
                   shareTag.mId = str1;
                }else if(TextUtils.n("magic_face", shareTag.mType)){
                   shareTag.mTagType = 4;
                   MagicEmoji$MagicFace magicFace = a.a.c(p0, MagicEmoji$MagicFace.class);
                   SimpleMagicFace mName1 = (magicFace != null)? magicFace.mName: str1;
                   shareTag.mTagName = mName1;
                   if (magicFace != null) {
                      str1 = magicFace.mId;
                   }
                   shareTag.mId = str1;
                }else if(TextUtils.n("same_frame", shareTag.mType)){
                   str = k0.h(p0, this, str1);
                   String str3 = k0.h(p0, "title", str1);
                   shareTag.mTagType = 5;
                   if (TextUtils.x(str)) {
                      str = str3;
                   }
                   shareTag.mTagName = str;
                   shareTag.mId = k0.h(p0, str2, str1);
                }else if(TextUtils.n("location", shareTag.mType)){
                   shareTag.mTagType = 6;
                   location = a.a.c(p0, Location.class);
                   Location mTitle = (location != null)? location.mTitle: str1;
                   shareTag.mTagName = mTitle;
                   if (location != null) {
                      str1 = String.valueOf(location.mId);
                   }
                   shareTag.mId = str1;
                }else {
                   shareTag.mTagType = -1;
                   shareTag.mTagName = str1;
                   shareTag.mId = str1;
                }
             }
          }
       }
    label_0174 :
       return shareTag;
    }
}
