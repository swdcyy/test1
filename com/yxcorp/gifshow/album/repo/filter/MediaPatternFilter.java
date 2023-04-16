package com.yxcorp.gifshow.album.repo.filter.MediaPatternFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import r79.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.yxcorp.gifshow.models.QMedia;
import k79.j;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class MediaPatternFilter extends IMediaSelectableFilter	// class@001a91
{
    public ArrayList allowPatterns;
    public String blackFilePath;
    public ArrayList disallowPatterns;
    public Long fetchAssetsStartTime;

    public void MediaPatternFilter(Long p0,String p1,ArrayList p2,ArrayList p3){
       super();
       this.fetchAssetsStartTime = p0;
       this.blackFilePath = p1;
       this.disallowPatterns = p2;
       this.allowPatterns = p3;
    }
    public final ArrayList getAllowPatterns(){
       return this.allowPatterns;
    }
    public final String getBlackFilePath(){
       return this.blackFilePath;
    }
    public final ArrayList getDisallowPatterns(){
       return this.disallowPatterns;
    }
    public final Long getFetchAssetsStartTime(){
       return this.fetchAssetsStartTime;
    }
    public int isDisplay(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaPatternFilter.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 != null) {
          MediaPatternFilter tMediaPatter = this.fetchAssetsStartTime;
          if (tMediaPatter != null) {
             long l = tMediaPatter.longValue();
             if (p0 instanceof QMedia && (p0.mModified * (long)1000) - l >= 0) {
                return -404;
             }
          }
          String path = p0.getPath();
          MediaPatternFilter tblackFilePa = this.blackFilePath;
          Object obj1 = PatchProxy.applyTwoRefs(path, tblackFilePa, null, j.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a.q(path, "mediaPath");
             if (TextUtils.isEmpty(tblackFilePa)) {
                b = false;
             }else if(tblackFilePa == null){
                a.L();
             }
             b = u.q2(path, tblackFilePa, i, 2, null);
             if (b) {
                Log.d("QMediaUtil", "mediaPath="+path+", is a blackFile");
             }
          }
          if (b) {
             i = -101;
          }else if(j.f(p0.getPath(), this.disallowPatterns)){
             i = -102;
          }else {
             MediaPatternFilter tallowPatter = this.allowPatterns;
             if (tallowPatter != null) {
                if (tallowPatter == null) {
                   a.L();
                }
                if (tallowPatter.size() > 0 && !j.f(p0.getPath(), this.allowPatterns)) {
                   i = -103;
                }
             }
          }
       }
    label_00b6 :
       return i;
    }
    public final void setAllowPatterns(ArrayList p0){
       this.allowPatterns = p0;
    }
    public final void setBlackFilePath(String p0){
       this.blackFilePath = p0;
    }
    public final void setDisallowPatterns(ArrayList p0){
       this.disallowPatterns = p0;
    }
    public final void setFetchAssetsStartTime(Long p0){
       this.fetchAssetsStartTime = p0;
    }
}
