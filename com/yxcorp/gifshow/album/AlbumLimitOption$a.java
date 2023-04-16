package com.yxcorp.gifshow.album.AlbumLimitOption$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.album.repo.filter.MediaUiLimitFilter;
import o79.i;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;
import kotlin.TypeCastException;
import java.lang.Long;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import com.yxcorp.gifshow.album.IBadMediaChecker;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.MediaPatternFilter;
import com.yxcorp.gifshow.album.repo.filter.MediaPicMinDurationLimitFilter;

public final class AlbumLimitOption$a	// class@0019bc
{

    public void AlbumLimitOption$a(){
       super();
    }
    public void AlbumLimitOption$a(u p0){
       super();
    }
    public final AlbumLimitOption$Builder a(){
       Object obj = PatchProxy.apply(null, this, AlbumLimitOption$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AlbumLimitOption$Builder();
    }
    public final AlbumLimitOption b(Bundle p0){
       Serializable serializable;
       Iterator iterator;
       AlbumLimitOption a;
       int i;
       AlbumLimitOption uAlbumLimitO = AlbumLimitOption.class;
       String str = "2";
       AlbumLimitOption obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$a.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "bundle");
       obj = this.a().d();
       String str1 = "max_count";
       if (p0.containsKey(str1)) {
          int intx = p0.getInt(str1);
          Objects.requireNonNull(obj);
          if (!PatchProxy.isSupport(uAlbumLimitO) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(intx), obj, uAlbumLimitO, str)) {
             obj.c = intx;
             obj.a.setMaxCount(intx);
          }
          obj.C(i.q(R.string.arg_RES_7f10188e, String.valueOf(obj.d())));
       }
       str = "album_reach_max_count_str";
       if (p0.containsKey(str)) {
          obj.C(p0.getString(str));
       }
       str = "ALBUM_MAX_DURATION_PER_VIDEO";
       if (p0.containsKey(str)) {
          obj.D(p0.getLong(str));
       }
       str = "ALBUM_REACH_MAX_DURATION_PER_VIDEO_STR";
       if (p0.containsKey(str)) {
          obj.E(p0.getString(str));
       }
       str = "ALBUM_MIN_DURATION_PER_VIDEO";
       if (p0.containsKey(str)) {
          obj.J(p0.getInt(str));
       }
       if (p0.containsKey(str)) {
          obj.j = p0.getInt("ALBUM_MIN_DURATION_PER_VIDEO_FOR_SHOW");
       }
       str = "ALBUM_NOT_REACH_MIN_DURATION_PER_VIDEO_STR";
       if (p0.containsKey(str)) {
          obj.K(p0.getString(str));
       }
       str = "album_max_duration";
       if (p0.containsKey(str)) {
          obj.H(p0.getLong(str));
       }
       str = "album_reach_max_duration_str";
       if (p0.containsKey(str)) {
          obj.I(p0.getString(str));
       }
       str = "album_minimum_size";
       if (p0.containsKey(str)) {
          obj.L(p0.getLong(str));
       }
       str = "album_max_size";
       if (p0.containsKey(str)) {
          obj.F(p0.getLong(str));
       }
       str = "album_reach_max_size_str";
       if (p0.containsKey(str)) {
          obj.G(p0.getString(str));
       }
       str = "album_reach_min_size_str";
       if (p0.containsKey(str)) {
          obj.p = p0.getString(str);
       }
       str = "album_allow_pattern";
       String str2 = "null cannot be cast to non-null type kotlin.collections.ArrayList<java.util.regex.Pattern> /* = java.util.ArrayList<java.util.regex.Pattern> */";
       if (p0.containsKey(str)) {
          serializable = SerializableHook.getSerializable(p0, str);
          if (serializable != null) {
             obj.x(serializable);
          }else {
             throw new TypeCastException(str2);
          }
       }
       str = "album_disallow_pattern";
       if (p0.containsKey(str)) {
          serializable = SerializableHook.getSerializable(p0, str);
          if (serializable != null) {
             obj.z(serializable);
          }else {
             throw new TypeCastException(str2);
          }
       }
       str = "album_black_file_path";
       if (p0.containsKey(str)) {
          obj.y(p0.getString(str));
       }
       str = "single_select";
       if (p0.containsKey(str)) {
          obj.N(p0.getBoolean(str));
       }
       str = "ALBUM_MASK_UNABLE_ITEM";
       if (p0.containsKey(str)) {
          obj.B(p0.getBoolean(str));
       }
       str = "ALBUM_MIN_HEIGHT";
       if (p0.containsKey(str)) {
          obj.u = p0.getInt(str);
       }
       str = "ALBUM_MIN_WIDTH";
       if (p0.containsKey(str)) {
          obj.v = p0.getInt(str);
       }
       str = "ALBUM_MIN_HEIGHT_WIDTH_ALERT";
       if (p0.containsKey(str)) {
          obj.w = p0.getString(str);
       }
       str = "ALBUM_FETCH_ASSETS_START_TIME";
       if (p0.containsKey(str)) {
          obj.x = Long.valueOf(p0.getLong(str));
       }
       str = "ALBUM_MIN_SELECTABLE_FILTER";
       str2 = "<set-?>";
       if (p0.containsKey(str)) {
          serializable = SerializableHook.getSerializable(p0, str);
          if (serializable != null) {
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(serializable, obj, uAlbumLimitO, "7")) {
                a.q(serializable, str2);
                obj.y = serializable;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.selected.interact.MediaFilterList");
          }
       }
       str = "ALBUM_BAD_MEDIA_CHECKER";
       if (p0.containsKey(str)) {
          serializable = SerializableHook.getSerializable(p0, str);
          if (serializable != null) {
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(serializable, obj, uAlbumLimitO, "8")) {
                a.q(serializable, str2);
                obj.z = serializable;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.IBadMediaChecker");
          }
       }
       String str3 = "ALBUM_SCENE_TYPE_MEDIA_TYPE";
       if (p0.containsKey(str3)) {
          obj.M(p0.getInt(str3));
       }
       str3 = "ALBUM_BIZ_CODE";
       if (p0.containsKey(str3)) {
          str3 = p0.getString(str3, "post_asset_picker");
          a.h(str3, "bundle.getString\(AlbumCo¡­s.DEFAULT_ALBUM_BIZ_CODE\)");
          obj.w(str3);
       }
       str3 = "ALBUM_MIN_DURATION_AFFECT_PIC";
       if (p0.containsKey(str3)) {
          obj.B = p0.getBoolean(str3);
       }
       str3 = "ALBUM_MIN_SELECTED_COUNT";
       if (p0.containsKey(str3)) {
          obj.C = p0.getInt(str3);
       }
       str3 = "ALBUM_MIN_SELECTED_COUNT_ALERT";
       if (p0.containsKey(str3)) {
          obj.D = p0.getString(str3);
       }
       str3 = "ALBUM_SINGLE_MULTI_SELECT";
       if (p0.containsKey(str3)) {
          obj.A(p0.getBoolean(str3));
       }
       str3 = "ALBUM_INTERCEPT_PREVIEW";
       if (p0.containsKey(str3)) {
          obj.G = p0.getBoolean(str3);
       }
       Set filters = obj.u().getFilters();
       if (filters != null) {
          iterator = filters.iterator();
          while (iterator.hasNext()) {
             IMediaSelectableFilter iMediaSelect = iterator.next();
             if (iMediaSelect instanceof MediaUiLimitFilter || iMediaSelect instanceof MediaPatternFilter) {
                Set filters1 = obj.u().getFilters();
                if (filters1 != null) {
                   filters1.remove(iMediaSelect);
                }
             }
          }
       }
       a = obj.a;
       a.setMaxCount(obj.c);
       a.setMaxCountAlert(obj.e());
       a.setMinDurationPerVideo(obj.l());
       a.setMinDurationPerVideoAlert(obj.m());
       a.setMaxDurationPerVideo(obj.f());
       a.setMaxDurationPerVideoAlert(obj.g());
       a.setMaxTotalVideoDuration(obj.j());
       a.setMaxTotalVideoDurationAlert(obj.k());
       a.setMinSize(obj.q());
       a.setMinSizeAlert(obj.r());
       a.setMaxSize(obj.h());
       a.setMaxSizeAlert(obj.i());
       a.setMinHeight(obj.n());
       a.setMinWidth(obj.s());
       a.setMinHeightWidthAlert(obj.o());
       obj.u().add(obj.a);
       obj.u().add(new MediaPatternFilter(obj.x, obj.t, obj.c(), obj.r));
       if (obj.B != null) {
          filters = obj.u().getFilters();
          i = 0;
          if (filters != null) {
             iterator = filters.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   if (obj1 instanceof MediaPicMinDurationLimitFilter) {
                      i = obj1;
                   }
                }
             }
          }
          if (i == null) {
             a = obj.b;
             a.setMinDurationPerVideo(obj.l());
             a.setMinDurationPerVideoAlert(obj.m());
             obj.u().add(obj.b);
          }
       }
       return obj;
    }
}
