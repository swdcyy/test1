package com.yxcorp.gifshow.album.repo.filter.MediaUiLimitFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.MediaUiLimitFilter$a;
import nsd.u;
import java.lang.String;
import r79.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.EmptyQMedia;
import o79.i;
import kotlin.jvm.internal.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o79.q;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class MediaUiLimitFilter extends IMediaSelectableFilter	// class@001a95
{
    public String alert;
    public int maxCount;
    public String maxCountAlert;
    public long maxDurationPerVideo;
    public String maxDurationPerVideoAlert;
    public boolean maxDurationUseSdk;
    public long maxSize;
    public String maxSizeAlert;
    public long maxTotalVideoDuration;
    public String maxTotalVideoDurationAlert;
    public int minDurationPerVideo;
    public String minDurationPerVideoAlert;
    public int minHeight;
    public String minHeightWidthAlert;
    public long minSize;
    public String minSizeAlert;
    public int minWidth;
    public boolean singleSelect;
    public static final MediaUiLimitFilter$a Companion;

    static {
       MediaUiLimitFilter.Companion = new MediaUiLimitFilter$a(null);
    }
    public void MediaUiLimitFilter(boolean p0,int p1,String p2,int p3,String p4,long p5,String p6,long p7,String p8,long p9,String p10,long p11,String p12,int p13,int p14,String p15){
       int i = this;
       super();
       i.singleSelect = p0;
       i.maxCount = p1;
       i.maxCountAlert = p2;
       i.minDurationPerVideo = p3;
       i.minDurationPerVideoAlert = p4;
       i.maxDurationPerVideo = p5;
       i.maxDurationPerVideoAlert = p6;
       i.maxTotalVideoDuration = p7;
       i.maxTotalVideoDurationAlert = p8;
       i.minSize = p9;
       i.minSizeAlert = p10;
       i.maxSize = p11;
       i.maxSizeAlert = p12;
       i.minHeight = p13;
       i.minWidth = p14;
       i.minHeightWidthAlert = p15;
       i.alert = "";
    }
    public final int getMaxCount(){
       return this.maxCount;
    }
    public final String getMaxCountAlert(){
       return this.maxCountAlert;
    }
    public final long getMaxDurationPerVideo(){
       return this.maxDurationPerVideo;
    }
    public final String getMaxDurationPerVideoAlert(){
       return this.maxDurationPerVideoAlert;
    }
    public final boolean getMaxDurationUseSdk(){
       return this.maxDurationUseSdk;
    }
    public final long getMaxSize(){
       return this.maxSize;
    }
    public final String getMaxSizeAlert(){
       return this.maxSizeAlert;
    }
    public final long getMaxTotalVideoDuration(){
       return this.maxTotalVideoDuration;
    }
    public final String getMaxTotalVideoDurationAlert(){
       return this.maxTotalVideoDurationAlert;
    }
    public final int getMinDurationPerVideo(){
       return this.minDurationPerVideo;
    }
    public final String getMinDurationPerVideoAlert(){
       return this.minDurationPerVideoAlert;
    }
    public final int getMinHeight(){
       return this.minHeight;
    }
    public final String getMinHeightWidthAlert(){
       return this.minHeightWidthAlert;
    }
    public final long getMinSize(){
       return this.minSize;
    }
    public final String getMinSizeAlert(){
       return this.minSizeAlert;
    }
    public final int getMinWidth(){
       return this.minWidth;
    }
    public final boolean getSingleSelect(){
       return this.singleSelect;
    }
    public int isSelectable(c p0,List p1){
       int b1;
       String str2;
       List list;
       ArrayList uArrayList;
       MediaUiLimitFilter maxCount;
       Object obj = this;
       MediaUiLimitFilter obj1 = p0;
       Iterator obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, MediaUiLimitFilter.class, "1");
       if (obj3 != patchProxyRe) {
          return obj3.intValue();
       }
       int i = 0;
       String str = "";
       if (obj1 == null) {
          obj.alert = str;
       }else {
          MediaUiLimitFilter obj4 = PatchProxy.applyOneRefs(obj2, obj, MediaUiLimitFilter.class, "2");
          boolean b = true;
          if (obj4 != patchProxyRe) {
             b1 = obj4.booleanValue();
          }else if(obj2 != null){
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                Object obj7 = iterator.next();
                int i2 = obj7 instanceof EmptyQMedia ^ b;
                if (i2) {
                   uArrayList1.add(obj7);
                }
             }
             b1 = uArrayList1.size();
          }else {
             b1 = 0;
          }
          String str1 = (obj.singleSelect != null)? 1: obj.maxCount;
          if (b1 >= str1) {
             b1 = true;
          }else {
             b1 = false;
          }
          str1 = "CommonUtil.string\(\n     бн.toString\(\)\n            \)";
          if (b1) {
             obj1 = obj.maxCountAlert;
             if (obj1 == null) {
                str2 = i.q(R.string.arg_RES_7f10188e, String.valueOf(obj.maxCount));
                a.h(str2, str1);
             }
             obj.alert = obj1;
             i = -1;
          }else if(p0.isVideoType() && (obj.maxDurationPerVideo > 0 && p0.getDuration() - obj.maxDurationPerVideo > 0)){
             obj1 = obj.maxDurationPerVideoAlert;
             if (obj1 != null) {
                str = obj1;
             }
             obj.alert = str;
             i = -9;
          }else if(p0.isVideoType()){
             obj4 = obj.minDurationPerVideo;
             if (p0.getDuration() - (long)obj4 < 0) {
                obj1 = obj.minDurationPerVideoAlert;
                if (obj1 == null) {
                   str2 = i.q(R.string.arg_RES_7f1018d0, String.valueOf(((long)obj4 / 1000)));
                   a.h(str2, str1);
                }
                obj.alert = obj1;
                i = -8;
             }
          }
          if (obj.maxSize > 0 && (p0.getSize() > 0 && p0.getSize() - obj.maxSize > 0)) {
             obj1 = obj.maxSizeAlert;
             if (obj1 != null) {
                str = obj1;
             }
             obj.alert = str;
             i = -3;
          }else {
             MediaUiLimitFilter minSize = obj.minSize;
             long size = p0.getSize();
             if (1 - size <= 0 && minSize - size > 0) {
                obj1 = obj.minSizeAlert;
                if (obj1 != null) {
                   str = obj1;
                }
                obj.alert = str;
                i = -2;
             }else if(p0.getWidth() < obj.minWidth || p0.getHeight() < obj.minHeight){
                obj1 = obj.minHeightWidthAlert;
                if (obj1 != null) {
                   str = obj1;
                }
                obj.alert = str;
                i = -4;
             }else {
                q obj5 = PatchProxy.applyTwoRefs(obj1, obj2, obj, MediaUiLimitFilter.class, "3");
                if (obj5 != patchProxyRe) {
                   b = obj5.booleanValue();
                }else if(obj2 != null){
                   list = CollectionsKt___CollectionsKt.J5(p1);
                   if (list != null) {
                   label_0144 :
                      list.add(obj1);
                      obj5 = q.a;
                      if (obj5.a(obj.maxDurationUseSdk, list) - obj.maxTotalVideoDuration > 0) {
                         MediaUiLimitFilter maxDurationU = obj.maxDurationUseSdk;
                         if (obj2 != null) {
                            uArrayList = new ArrayList();
                            obj2 = p1.iterator();
                            while (obj2.hasNext()) {
                               Object obj6 = obj2.next();
                               int i1 = obj6 instanceof EmptyQMedia ^ b;
                               if (i1) {
                                  uArrayList.add(obj6);
                               }
                            }
                         }else {
                            uArrayList = null;
                         }
                         long l = obj5.a(maxDurationU, uArrayList);
                         if (obj.maxDurationUseSdk != null) {
                            long l1 = obj.maxTotalVideoDuration - l;
                            if ((float)l1 - 0x447a0000 >= 0) {
                               obj1.setClipDuration(l1);
                            }
                         }
                      }
                      b = false;
                   }
                }
                list = new ArrayList();
                goto label_0144 ;
                if (b) {
                   obj1 = obj.maxTotalVideoDurationAlert;
                   if (obj1 != null) {
                      str = obj1;
                   }
                   obj.alert = str;
                   i = -7;
                }else {
                   obj.alert = str;
                   if (p0.getSize() <= 0) {
                      Log.n("MediaUiLimitFilter", "canNotSelect: no media.size="+p0.getSize());
                   }
                }
             }
          }
       }
       return i;
    }
    public String nonselectableAlert(){
       return this.alert;
    }
    public final void setMaxCount(int p0){
       this.maxCount = p0;
    }
    public final void setMaxCountAlert(String p0){
       this.maxCountAlert = p0;
    }
    public final void setMaxDurationPerVideo(long p0){
       this.maxDurationPerVideo = p0;
    }
    public final void setMaxDurationPerVideoAlert(String p0){
       this.maxDurationPerVideoAlert = p0;
    }
    public final void setMaxDurationUseSdk(boolean p0){
       this.maxDurationUseSdk = p0;
    }
    public final void setMaxSize(long p0){
       this.maxSize = p0;
    }
    public final void setMaxSizeAlert(String p0){
       this.maxSizeAlert = p0;
    }
    public final void setMaxTotalVideoDuration(long p0){
       this.maxTotalVideoDuration = p0;
    }
    public final void setMaxTotalVideoDurationAlert(String p0){
       this.maxTotalVideoDurationAlert = p0;
    }
    public final void setMinDurationPerVideo(int p0){
       this.minDurationPerVideo = p0;
    }
    public final void setMinDurationPerVideoAlert(String p0){
       this.minDurationPerVideoAlert = p0;
    }
    public final void setMinHeight(int p0){
       this.minHeight = p0;
    }
    public final void setMinHeightWidthAlert(String p0){
       this.minHeightWidthAlert = p0;
    }
    public final void setMinSize(long p0){
       this.minSize = p0;
    }
    public final void setMinSizeAlert(String p0){
       this.minSizeAlert = p0;
    }
    public final void setMinWidth(int p0){
       this.minWidth = p0;
    }
    public final void setSingleSelect(boolean p0){
       this.singleSelect = p0;
    }
}
