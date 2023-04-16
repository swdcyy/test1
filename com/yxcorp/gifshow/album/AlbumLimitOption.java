package com.yxcorp.gifshow.album.AlbumLimitOption;
import com.yxcorp.gifshow.album.AlbumLimitOption$a;
import nsd.u;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.lang.Object;
import com.yxcorp.gifshow.album.repo.filter.MediaUiLimitFilter;
import java.lang.String;
import com.yxcorp.gifshow.album.repo.filter.MediaPicMinDurationLimitFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.MediaPatternFilter;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Number;
import com.yxcorp.gifshow.album.IBadMediaChecker;

public final class AlbumLimitOption	// class@0019bd
{
    public String A;
    public boolean B;
    public int C;
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public final MediaUiLimitFilter a;
    public final MediaPicMinDurationLimitFilter b;
    public int c;
    public boolean d;
    public String e;
    public long f;
    public String g;
    public int h;
    public String i;
    public int j;
    public long k;
    public String l;
    public long m;
    public long n;
    public String o;
    public String p;
    public boolean q;
    public ArrayList r;
    public ArrayList s;
    public String t;
    public int u;
    public int v;
    public String w;
    public Long x;
    public MediaFilterList y;
    public IBadMediaChecker z;
    public static final AlbumLimitOption$a H;

    static {
       AlbumLimitOption.H = new AlbumLimitOption$a(null);
    }
    public void AlbumLimitOption(AlbumLimitOption$Builder p0){
       AlbumLimitOption uAlbumLimitO = this;
       AlbumLimitOption$Builder uBuilder = p0;
       AlbumLimitOption$Builder b = uBuilder.b;
       AlbumLimitOption$Builder c = uBuilder.c;
       AlbumLimitOption$Builder d = uBuilder.d;
       AlbumLimitOption$Builder e = uBuilder.e;
       AlbumLimitOption$Builder g = uBuilder.g;
       AlbumLimitOption$Builder f = uBuilder.f;
       AlbumLimitOption$Builder h = uBuilder.h;
       AlbumLimitOption$Builder i = uBuilder.i;
       AlbumLimitOption$Builder k = uBuilder.k;
       AlbumLimitOption$Builder uBuilder1 = uBuilder.j;
       AlbumLimitOption$Builder l = uBuilder.l;
       AlbumLimitOption$Builder uBuilder2 = uBuilder.a;
       AlbumLimitOption$Builder uBuilder3 = uBuilder.m;
       AlbumLimitOption$Builder uBuilder4 = uBuilder.n;
       AlbumLimitOption$Builder uBuilder5 = uBuilder.o;
       AlbumLimitOption$Builder uBuilder6 = uBuilder.q;
       AlbumLimitOption$Builder uBuilder7 = uBuilder.r;
       AlbumLimitOption$Builder uBuilder8 = uBuilder.p;
       AlbumLimitOption$Builder uBuilder9 = uBuilder.s;
       AlbumLimitOption$Builder uBuilder10 = uBuilder.t;
       AlbumLimitOption$Builder uBuilder11 = uBuilder.u;
       AlbumLimitOption$Builder uBuilder12 = uBuilder.v;
       AlbumLimitOption$Builder w = uBuilder.w;
       if (w != null) {
       }else {
          w = new MediaFilterList();
       }
       super();
       uAlbumLimitO.e = b;
       uAlbumLimitO.f = c;
       uAlbumLimitO.g = d;
       uAlbumLimitO.h = e;
       uAlbumLimitO.i = g;
       uAlbumLimitO.j = f;
       uAlbumLimitO.k = h;
       uAlbumLimitO.l = i;
       uAlbumLimitO.m = uBuilder1;
       uAlbumLimitO.n = k;
       uAlbumLimitO.o = l;
       uAlbumLimitO.p = uBuilder3;
       uAlbumLimitO.q = uBuilder5;
       uAlbumLimitO.r = uBuilder6;
       uAlbumLimitO.s = uBuilder7;
       uAlbumLimitO.t = uBuilder8;
       uAlbumLimitO.u = uBuilder9;
       uAlbumLimitO.v = uBuilder10;
       uAlbumLimitO.w = uBuilder11;
       uAlbumLimitO.x = uBuilder12;
       uAlbumLimitO.y = w;
       uAlbumLimitO.z = uBuilder.E;
       uAlbumLimitO.A = uBuilder.x;
       uAlbumLimitO.B = uBuilder.y;
       uAlbumLimitO.C = uBuilder.z;
       uAlbumLimitO.D = uBuilder.A;
       uAlbumLimitO.E = uBuilder.C;
       uAlbumLimitO.F = uBuilder.B;
       uAlbumLimitO.G = uBuilder.D;
       MediaUiLimitFilter mediaUiLimit = new MediaUiLimitFilter(uBuilder4, this.d(), uAlbumLimitO.e, uAlbumLimitO.h, uAlbumLimitO.i, uAlbumLimitO.f, uAlbumLimitO.g, uAlbumLimitO.k, uAlbumLimitO.l, uAlbumLimitO.m, uAlbumLimitO.p, uAlbumLimitO.n, uAlbumLimitO.o, uAlbumLimitO.u, uAlbumLimitO.v, uAlbumLimitO.w);
       uAlbumLimitO.a = uBuilder;
       uAlbumLimitO.b = new MediaPicMinDurationLimitFilter(uAlbumLimitO.h, uAlbumLimitO.i);
       uAlbumLimitO.c = uBuilder2;
       uAlbumLimitO.d = uBuilder4;
       uAlbumLimitO.y.add(uBuilder);
       uAlbumLimitO.y.add(new MediaPatternFilter(uAlbumLimitO.x, uAlbumLimitO.t, uAlbumLimitO.s, uAlbumLimitO.r));
       return;
    }
    public final void A(boolean p0){
       this.F = p0;
    }
    public final void B(boolean p0){
       this.q = p0;
    }
    public final void C(String p0){
       this.e = p0;
    }
    public final void D(long p0){
       this.f = p0;
    }
    public final void E(String p0){
       this.g = p0;
    }
    public final void F(long p0){
       this.n = p0;
    }
    public final void G(String p0){
       this.o = p0;
    }
    public final void H(long p0){
       this.k = p0;
    }
    public final void I(String p0){
       this.l = p0;
    }
    public final void J(int p0){
       this.h = p0;
    }
    public final void K(String p0){
       this.i = p0;
    }
    public final void L(long p0){
       this.m = p0;
    }
    public final void M(int p0){
       this.E = p0;
    }
    public final void N(boolean p0){
       AlbumLimitOption uAlbumLimitO = AlbumLimitOption.class;
       if (PatchProxy.isSupport(uAlbumLimitO) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAlbumLimitO, "3")) {
          return;
       }
       this.d = p0;
       this.a.setSingleSelect(p0);
       return;
    }
    public final void O(Bundle p0){
       AlbumLimitOption te;
       AlbumLimitOption ty;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumLimitOption.class, "4")) {
          return;
       }
       a.q(p0, "bundle");
       String str = "max_count";
       if (!p0.containsKey(str)) {
          p0.putInt(str, this.c);
       }
       str = "album_reach_max_count_str";
       if (!p0.containsKey(str)) {
          te = this.e;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "ALBUM_MAX_DURATION_PER_VIDEO";
       if (!p0.containsKey(str)) {
          p0.putLong(str, this.f);
       }
       str = "ALBUM_REACH_MAX_DURATION_PER_VIDEO_STR";
       if (!p0.containsKey(str)) {
          te = this.g;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "ALBUM_MIN_DURATION_PER_VIDEO";
       if (!p0.containsKey(str)) {
          p0.putInt(str, this.h);
       }
       str = "ALBUM_MIN_DURATION_PER_VIDEO_FOR_SHOW";
       if (!p0.containsKey(str)) {
          p0.putInt(str, this.j);
       }
       str = "ALBUM_NOT_REACH_MIN_DURATION_PER_VIDEO_STR";
       if (!p0.containsKey(str)) {
          te = this.i;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "album_max_duration";
       if (!p0.containsKey(str)) {
          p0.putLong(str, this.k);
       }
       str = "album_reach_max_duration_str";
       if (!p0.containsKey(str)) {
          te = this.l;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "album_minimum_size";
       if (!p0.containsKey(str)) {
          p0.putLong(str, this.m);
       }
       str = "album_max_size";
       if (!p0.containsKey(str)) {
          p0.putLong(str, this.n);
       }
       str = "album_reach_max_size_str";
       if (!p0.containsKey(str)) {
          te = this.o;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "album_reach_min_size_str";
       if (!p0.containsKey(str)) {
          te = this.p;
          if (te != null) {
             p0.putString(str, te);
          }
       }
       str = "single_select";
       if (!p0.containsKey(str)) {
          p0.putBoolean(str, this.d);
       }
       str = "album_allow_pattern";
       if (!p0.containsKey(str)) {
          SerializableHook.putSerializable(p0, str, this.r);
       }
       str = "album_disallow_pattern";
       if (!p0.containsKey(str)) {
          SerializableHook.putSerializable(p0, str, this.s);
       }
       str = "album_black_file_path";
       if (!p0.containsKey(str)) {
          p0.putString(str, this.t);
       }
       str = "ALBUM_MASK_UNABLE_ITEM";
       if (!p0.containsKey(str)) {
          p0.putBoolean(str, this.q);
       }
       str = "ALBUM_MIN_HEIGHT";
       if (!p0.containsKey(str)) {
          p0.putInt(str, this.u);
       }
       str = "ALBUM_MIN_WIDTH";
       if (!p0.containsKey(str)) {
          p0.putInt(str, this.v);
       }
       str = "ALBUM_MIN_HEIGHT_WIDTH_ALERT";
       if (!p0.containsKey(str)) {
          p0.putString(str, this.w);
       }
       str = "ALBUM_FETCH_ASSETS_START_TIME";
       if (!p0.containsKey(str)) {
          te = this.x;
          if (te != null) {
             p0.putLong(str, te.longValue());
          }
       }
       if (!p0.containsKey("ALBUM_MIN_SELECTABLE_FILTER")) {
          ty = this.y;
          if (ty != null) {
             SerializableHook.putSerializable(p0, "ALBUM_MIN_SELECTABLE_FILTER", ty);
          }
       }
       if (!p0.containsKey("ALBUM_BAD_MEDIA_CHECKER")) {
          ty = this.z;
          if (ty != null) {
             SerializableHook.putSerializable(p0, "ALBUM_BAD_MEDIA_CHECKER", ty);
          }
       }
       if (!p0.containsKey("ALBUM_SCENE_TYPE_MEDIA_TYPE")) {
          p0.putInt("ALBUM_SCENE_TYPE_MEDIA_TYPE", this.E);
       }
       if (!p0.containsKey("ALBUM_BIZ_CODE")) {
          p0.putString("ALBUM_BIZ_CODE", this.A);
       }
       if (!p0.containsKey("ALBUM_MIN_DURATION_AFFECT_PIC")) {
          p0.putBoolean("ALBUM_MIN_DURATION_AFFECT_PIC", this.B);
       }
       if (!p0.containsKey("ALBUM_MIN_SELECTED_COUNT")) {
          p0.putInt("ALBUM_MIN_SELECTED_COUNT", this.C);
       }
       if (!p0.containsKey("ALBUM_MIN_SELECTED_COUNT_ALERT")) {
          p0.putString("ALBUM_MIN_SELECTED_COUNT_ALERT", this.D);
       }
       if (!p0.containsKey("ALBUM_INTERCEPT_PREVIEW")) {
          SerializableHook.putSerializable(p0, "ALBUM_INTERCEPT_PREVIEW", Boolean.valueOf(this.G));
       }
       return;
    }
    public final String a(){
       return this.A;
    }
    public final IBadMediaChecker b(){
       return this.z;
    }
    public final ArrayList c(){
       return this.s;
    }
    public final int d(){
       int i = (this.d != null)? 1: this.c;
       return i;
    }
    public final String e(){
       return this.e;
    }
    public final long f(){
       return this.f;
    }
    public final String g(){
       return this.g;
    }
    public final long h(){
       return this.n;
    }
    public final String i(){
       return this.o;
    }
    public final long j(){
       return this.k;
    }
    public final String k(){
       return this.l;
    }
    public final int l(){
       return this.h;
    }
    public final String m(){
       return this.i;
    }
    public final int n(){
       return this.u;
    }
    public final String o(){
       return this.w;
    }
    public final int p(){
       return this.C;
    }
    public final long q(){
       return this.m;
    }
    public final String r(){
       return this.p;
    }
    public final int s(){
       return this.v;
    }
    public final int t(){
       return this.E;
    }
    public final MediaFilterList u(){
       return this.y;
    }
    public final boolean v(){
       return this.d;
    }
    public final void w(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumLimitOption.class, "9")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.A = p0;
       return;
    }
    public final void x(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumLimitOption.class, "5")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.r = p0;
       return;
    }
    public final void y(String p0){
       this.t = p0;
    }
    public final void z(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumLimitOption.class, "6")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.s = p0;
       return;
    }
}
