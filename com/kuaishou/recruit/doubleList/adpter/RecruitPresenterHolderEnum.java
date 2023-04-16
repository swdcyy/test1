package com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum;
import java.lang.Enum;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$1;
import java.lang.String;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$2;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$3;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$4;
import com.kuaishou.recruit.doubleList.adpter.RecruitPresenterHolderEnum$5;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Class;
import java.util.EnumMap;
import com.google.common.collect.Maps;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import y8c.f;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;

public abstract class RecruitPresenterHolderEnum extends Enum	// class@000ea5
{
    public static final RecruitPresenterHolderEnum[] $VALUES;
    public static final RecruitPresenterHolderEnum Banner;
    public static final RecruitPresenterHolderEnum Image;
    public static final RecruitPresenterHolderEnum Live;
    public static final RecruitPresenterHolderEnum TKPopularJob;
    public static final RecruitPresenterHolderEnum Video;
    public static final EnumMap sPresenterHolderFactory;

    static {
       RecruitPresenterHolderEnum$1 u1 = new RecruitPresenterHolderEnum$1("Live", 0);
       RecruitPresenterHolderEnum.Live = u1;
       RecruitPresenterHolderEnum$2 u2 = new RecruitPresenterHolderEnum$2("Video", 1);
       RecruitPresenterHolderEnum.Video = u2;
       RecruitPresenterHolderEnum$3 u3 = new RecruitPresenterHolderEnum$3("Image", 2);
       RecruitPresenterHolderEnum.Image = u3;
       RecruitPresenterHolderEnum$4 u4 = new RecruitPresenterHolderEnum$4("TKPopularJob", 3);
       RecruitPresenterHolderEnum.TKPopularJob = u4;
       RecruitPresenterHolderEnum$5 u5 = new RecruitPresenterHolderEnum$5("Banner", 4);
       RecruitPresenterHolderEnum.Banner = u5;
       RecruitPresenterHolderEnum[] recruitPrese = new RecruitPresenterHolderEnum[]{u1,u2,u3,u4,u5};
       RecruitPresenterHolderEnum.$VALUES = recruitPrese;
       EnumMap uEnumMap = Maps.r(PhotoType.class);
       RecruitPresenterHolderEnum.sPresenterHolderFactory = uEnumMap;
       uEnumMap.put(PhotoType.LIVESTREAM, u1);
       uEnumMap.put(PhotoType.VIDEO, u2);
       uEnumMap.put(PhotoType.IMAGE, u3);
       uEnumMap.put(PhotoType.RECRUIT_BANNER_STYLE, u5);
       uEnumMap.put(PhotoType.RECRUIT_SELECT_JOB_FEED, u4);
    }
    public void RecruitPresenterHolderEnum(String p0,int p1){
       super(p0, p1);
    }
    public void RecruitPresenterHolderEnum(String p0,int p1,RecruitPresenterHolderEnum$1 p2){
       super(p0, p1);
    }
    public static boolean isValidPhotoType(PhotoType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecruitPresenterHolderEnum.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return RecruitPresenterHolderEnum.sPresenterHolderFactory.containsKey(p0);
    }
    public static RecruitPresenterHolderEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecruitPresenterHolderEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RecruitPresenterHolderEnum.class, p0);
    }
    public static f valueOfType(PhotoType p0,ViewGroup p1){
       RecruitPresenterHolderEnum obj = PatchProxy.applyTwoRefs(p0, p1, null, RecruitPresenterHolderEnum.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RecruitPresenterHolderEnum.sPresenterHolderFactory.get(p0);
       if (obj != null) {
          return obj.createPresenterHolder(p1);
       }
       throw new IllegalArgumentException(p0+" type not support in"+"RecruitPresenterHolderEnum");
    }
    public static RecruitPresenterHolderEnum[] values(){
       Object obj = PatchProxy.apply(null, null, RecruitPresenterHolderEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecruitPresenterHolderEnum.$VALUES.clone();
    }
    public f createPresenterHolder(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecruitPresenterHolderEnum.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.i(p0, this.getItemLayoutRes());
       return new f(view, this.getPresenter(view));
    }
    public abstract int getItemLayoutRes();
    public abstract PresenterV2 getPresenter(View p0);
}
