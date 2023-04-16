package com.yxcorp.gifshow.moment.publish.util.MomentSelectableFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;

public class MomentSelectableFilter extends IMediaSelectableFilter	// class@001fbf
{
    public int mCurrentSelectStatus;
    public DataType mCurrentSelectType;
    public final int mMaxImageNum;
    public final int mMaxVideoNum;
    public final long mPickPhotoMaxDurationMs;
    public static final long serialVersionUID = 0x1d0d7be80d82533c;

    public void MomentSelectableFilter(int p0,int p1,long p2){
       super();
       this.mCurrentSelectStatus = 0;
       this.mMaxImageNum = p1;
       this.mMaxVideoNum = p0;
       this.mPickPhotoMaxDurationMs = p2;
    }
    public final int a(int p0,c p1){
       if (PatchProxy.isSupport(MomentSelectableFilter.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, MomentSelectableFilter.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0 && p1 != null) {
          this.mCurrentSelectType = p1.getDataType();
       }
       this.mCurrentSelectStatus = p0;
       return p0;
    }
    public int isClickable(c p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentSelectableFilter.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.applyOneRefs(p0, this, MomentSelectableFilter.class, "3");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(p0 != null && p0.getDataType() == DataType.VIDEO){
          if (p0.getDuration() - this.mPickPhotoMaxDurationMs > 0) {
             i = -9;
          }else if(p0.getDuration() - 1000 < 0){
             i = -8;
          }
       }
       i = 0;
       return i;
    }
    public int isSelectable(c p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MomentSelectableFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -6;
       if (p0 == null) {
          return this.a(i, null);
       }
       if (q.f(p1)) {
          if (p0.getDataType() == DataType.IMAGE && this.mMaxImageNum == null) {
             if (this.mMaxVideoNum == null) {
                return this.a(-1, p0);
             }
             return this.a(i, p0);
          }else if(p0.getDataType() == DataType.VIDEO && this.mMaxVideoNum == null){
             if (this.mMaxImageNum == null) {
                return this.a(-1, p0);
             }
             return this.a(i, p0);
          }else {
             return this.a(0, p0);
          }
       }else if(p0.getDataType() != p1.get(0).getDataType()){
          return this.a(i, p0);
       }else if(p1.get(0).getDataType() == DataType.IMAGE){
          if (p1.size() < this.mMaxImageNum) {
             return this.a(0, p0);
          }
          return this.a(-1, p0);
       }else if(p1.size() < this.mMaxVideoNum){
          return this.a(0, p0);
       }else {
          return this.a(-1, p0);
       }
    }
    public String nonselectableAlert(){
       MomentSelectableFilter obj = PatchProxy.apply(null, this, MomentSelectableFilter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCurrentSelectStatus;
       if (obj == -9) {
          return a1.r(0x7f1039d1, DateUtils.A(a.b(), this.mPickPhotoMaxDurationMs));
       }
       if (obj == -6) {
          return a1.p(0x7f104615);
       }
       if (obj != -1) {
          return super.nonselectableAlert();
       }
       if (this.mCurrentSelectType == DataType.VIDEO) {
          return a1.q(0x7f103ac0, this.mMaxVideoNum);
       }
       return a1.q(0x7f105265, this.mMaxImageNum);
    }
}
