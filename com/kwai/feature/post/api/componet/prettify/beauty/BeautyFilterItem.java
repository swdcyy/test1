package com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.io.Serializable;
import java.lang.Cloneable;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import java.lang.Boolean;
import g16.a;
import java.lang.StringBuilder;
import q87.c;
import h16.j;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import h16.g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import java.lang.Math;

public class BeautyFilterItem implements Serializable, Cloneable	// class@0012d9
{
    public g mBeautifyGroupInfo;
    public BeautifyTagInfo mBeautifyTagInfo;
    public int mBeautyMode;
    public int mCategory;
    public List mDeformModeList;
    public boolean mHidden;
    public List mIconCdnUrls;
    public int mIconResId;
    public String mIconResKey;
    public String mIconUrl;
    public int mId;
    public ItemNameStyle mItemNameStyle;
    public BeautyFilterItem mLeftPart;
    public String mLogName;
    public float mMaxValue;
    public float mMinValue;
    public String mMvparamGroupKey;
    public String mMvparamKey;
    public String mName;
    public int mNameId;
    public String mNameResKey;
    public BeautyFilterItem mRightPart;
    public String mSerializedKey;
    public List mSupportVersion;
    public static final Map sDefaultBeautyModeMap;
    public static final Map sDefaultDeformModeMap;
    public static final Map sDefaultSerializedKeyMap;
    public static final long serialVersionUID;

    static {
       HashMap hashMap = new HashMap();
       BeautyFilterItem.sDefaultSerializedKeyMap = hashMap;
       HashMap hashMap1 = new HashMap();
       BeautyFilterItem.sDefaultDeformModeMap = hashMap1;
       HashMap hashMap2 = new HashMap();
       BeautyFilterItem.sDefaultBeautyModeMap = hashMap2;
       int i = 7;
       int i1 = 6;
       int i2 = 4;
       int i3 = 99;
       int i4 = 12;
       int i5 = 0;
       if (PatchProxy.applyVoid(null, null, BeautyFilterItem.class, "21")) {
       }else {
          hashMap.put(Integer.valueOf(i5), "bright");
          hashMap.put(Integer.valueOf(i3), "ruddy");
          hashMap.put(Integer.valueOf(1), "beauty");
          hashMap.put(Integer.valueOf(2), "thinFace");
          hashMap.put(Integer.valueOf(3), "jaw");
          hashMap.put(Integer.valueOf(i2), "enlargeEye");
          hashMap.put(Integer.valueOf(i1), "cutFace");
          hashMap.put(Integer.valueOf(i), "tinyFace");
          hashMap.put(Integer.valueOf(10), "wrinkle");
          hashMap.put(Integer.valueOf(11), "eyeBag");
          hashMap.put(Integer.valueOf(i4), "eyeBrighten");
          hashMap.put(Integer.valueOf(13), "teethBrighten");
          hashMap.put(Integer.valueOf(14), "beautifyLips");
          hashMap.put(Integer.valueOf(15), "noseShadow");
          hashMap.put(Integer.valueOf(16), "thinNoseV5");
          hashMap.put(Integer.valueOf(17), "mouth");
          hashMap.put(Integer.valueOf(18), "thinCheekbone");
          hashMap.put(Integer.valueOf(29), "clarity");
          hashMap.put(Integer.valueOf(30), "stereo");
          hashMap.put(Integer.valueOf(31), "newNarrowFace");
          hashMap.put(Integer.valueOf(32), "hairline");
          hashMap.put(Integer.valueOf(33), "noseBridge");
          hashMap.put(Integer.valueOf(34), "temple");
          hashMap.put(Integer.valueOf(35), "eyebrowWidth");
          hashMap.put(Integer.valueOf(36), "eyePosition");
          hashMap.put(Integer.valueOf(37), "longNose");
          hashMap.put(Integer.valueOf(38), "thinLowerJaw");
          hashMap.put(Integer.valueOf(39), "shortFace");
          hashMap.put(Integer.valueOf(40), "philtrum");
          hashMap.put(Integer.valueOf(42), "smallHead");
          hashMap.put(Integer.valueOf(43), "highSkull");
          hashMap.put(Integer.valueOf(44), "aideflaw");
       }
       if (!PatchProxy.applyVoid(null, null, BeautyFilterItem.class, "22")) {
          BeautyFilterItem$a[] uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 0)};
          hashMap1.put(Integer.valueOf(2), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 1)};
          hashMap1.put(Integer.valueOf(i1), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 2)};
          hashMap1.put(Integer.valueOf(i), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, i1)};
          hashMap1.put(Integer.valueOf(3), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, i4)};
          hashMap1.put(Integer.valueOf(37), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, i2)};
          hashMap1.put(Integer.valueOf(31), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 8)};
          hashMap1.put(Integer.valueOf(32), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 10)};
          hashMap1.put(Integer.valueOf(36), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 11)};
          hashMap1.put(Integer.valueOf(35), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 13)};
          hashMap1.put(Integer.valueOf(33), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 14)};
          hashMap1.put(Integer.valueOf(38), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 15)};
          hashMap1.put(Integer.valueOf(39), Lists.e(uoaArray));
          BeautyFilterItem$a[] uoaArray1 = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 14)};
          hashMap1.put(Integer.valueOf(40), Lists.e(uoaArray1));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 13)};
          hashMap1.put(Integer.valueOf(34), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 5)};
          hashMap1.put(Integer.valueOf(18), Lists.e(uoaArray));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 9)};
          hashMap1.put(Integer.valueOf(17), Lists.e(uoaArray));
          uoaArray1 = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, i)};
          hashMap1.put(Integer.valueOf(16), Lists.e(uoaArray1));
          uoaArray = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 1),new BeautyFilterItem$a(1, 2),new BeautyFilterItem$a(2, i1)};
          hashMap1.put(Integer.valueOf(i2), Lists.e(uoaArray));
          uoaArray1 = new BeautyFilterItem$a[]{new BeautyFilterItem$a(2, 15)};
          hashMap1.put(Integer.valueOf(42), Lists.e(uoaArray1));
          uoaArray1 = new BeautyFilterItem$a[]{new BeautyFilterItem$a(1, 16)};
          hashMap1.put(Integer.valueOf(43), Lists.e(uoaArray1));
       }
       if (!PatchProxy.applyVoid(null, null, BeautyFilterItem.class, "23")) {
          hashMap2.put(Integer.valueOf(0), Integer.valueOf(0));
          hashMap2.put(Integer.valueOf(99), Integer.valueOf(48));
          hashMap2.put(Integer.valueOf(1), Integer.valueOf(1));
          hashMap2.put(Integer.valueOf(44), Integer.valueOf(180));
          hashMap2.put(Integer.valueOf(10), Integer.valueOf(38));
          hashMap2.put(Integer.valueOf(11), Integer.valueOf(39));
          hashMap2.put(Integer.valueOf(12), Integer.valueOf(40));
          hashMap2.put(Integer.valueOf(13), Integer.valueOf(41));
          hashMap2.put(Integer.valueOf(14), Integer.valueOf(42));
          hashMap2.put(Integer.valueOf(15), Integer.valueOf(43));
          hashMap2.put(Integer.valueOf(30), Integer.valueOf(53));
          hashMap2.put(Integer.valueOf(29), Integer.valueOf(54));
       }
    }
    public void BeautyFilterItem(){
       super();
       this.mSupportVersion = new ArrayList();
       this.mIconCdnUrls = new ArrayList();
       this.mHidden = false;
       this.mLeftPart = null;
       this.mRightPart = null;
       this.mBeautifyTagInfo = null;
       this.mBeautyMode = -1;
       this.mDeformModeList = new ArrayList();
       this.mBeautifyGroupInfo = null;
    }
    public static void copyBeautyItemValue(BeautifyConfig p0,BeautifyConfig p1,int p2){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, BeautyFilterItem.class, "19")) {
          return;
       }
       BeautyFilterItem.setFilterValue(p1, BeautyFilterItem.getFilterValue(p0, p2), p2, false);
       return;
    }
    public static String getDefaultSerializedKey(int p0){
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, BeautyFilterItem.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = BeautyFilterItem.sDefaultSerializedKeyMap.get(Integer.valueOf(p0));
       if (str == null) {
          str = "";
       }
       return str;
    }
    public static float getFilterValue(BeautifyConfig p0,int p1){
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, BeautyFilterItem.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return BeautyFilterItem.getFilterValue(p0, p1, null);
    }
    public static float getFilterValue(BeautifyConfig p0,int p1,BeautyFilterItem p2){
       Float uFloat;
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, BeautyFilterItem.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 0;
       if (p2 == null) {
          p2 = p0.getBeautifyItemById(p1);
       }
       if (p2 != null) {
          String serializedKe = p2.getSerializedKey();
          if (!TextUtils.x(serializedKe)) {
             if (p2.mCategory == null && p0.mSmoothSkinConfigMap.containsKey(serializedKe)) {
                uFloat = p0.mSmoothSkinConfigMap.get(serializedKe);
                if (uFloat != null) {
                   f = uFloat.floatValue();
                }
             }else if(p2.mCategory == 1 && p0.mDeformConfigMap.containsKey(serializedKe)){
                uFloat = p0.mDeformConfigMap.get(serializedKe);
                if (uFloat != null) {
                   f = uFloat.floatValue();
                }
             }
          }
       }
       return f;
    }
    public static float getFilterValue(BeautifyConfig p0,BeautyFilterItem p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BeautyFilterItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return BeautyFilterItem.getFilterValue(p0, p1.mId, p1);
    }
    public static boolean isItemValueEquals(BeautifyConfig p0,BeautifyConfig p1,int p2){
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, BeautyFilterItem.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (Float.compare(BeautyFilterItem.getFilterValue(p0, p2), BeautyFilterItem.getFilterValue(p1, p2)))? true: false;
       return b;
    }
    public static void setFilterValue(BeautifyConfig p0,float p1,int p2){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, BeautyFilterItem.class, "15")) {
          return;
       }
       BeautyFilterItem.setFilterValue(p0, p1, p2, null, false);
       return;
    }
    public static void setFilterValue(BeautifyConfig p0,float p1,int p2,BeautyFilterItem p3,boolean p4){
       Object[] objArray2;
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, BeautyFilterItem.class, "18")) {
             return;
          }
       }
       if (p4) {
          Object[] objArray1 = new Object[0];
          a.C().w("BeautyFilterItem", "setFilterValue : "+p0.mId+" : "+p2+" : "+p1, objArray1);
       }
       if (p3 == null) {
          p3 = p0.getBeautifyItemById(p2);
       }
       if (p3 != null) {
          String serializedKe = p3.getSerializedKey();
          if (TextUtils.x(serializedKe)) {
             objArray2 = new Object[0];
             a.C().A("BeautyFilterItem", "set filter value error "+p3.getItemId()+"  "+p1, objArray2);
             return;
          }else {
             p3 = p3.mCategory;
             if (p3 == null) {
                p0.mSmoothSkinConfigMap.put(serializedKe, Float.valueOf(p1));
             }else if(p3 == 1){
                p0.mDeformConfigMap.put(serializedKe, Float.valueOf(p1));
             }
          }
       }else {
          objArray2 = new Object[0];
          a.C().A("BeautyFilterItem", "beautifyItem is null : "+p2, objArray2);
       }
       return;
    }
    public static void setFilterValue(BeautifyConfig p0,float p1,int p2,boolean p3){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, BeautyFilterItem.class, "16")) {
          return;
       }
       BeautyFilterItem.setFilterValue(p0, p1, p2, null, p3);
       return;
    }
    public static void setFilterValue(BeautifyConfig p0,float p1,BeautyFilterItem p2){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), p2, null, BeautyFilterItem.class, "17")) {
          return;
       }
       BeautyFilterItem.setFilterValue(p0, p1, p2.mId, p2, true);
       return;
    }
    public static void setFilterValueBySerializedKey(BeautifyConfig p0,String p1,float p2){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), null, BeautyFilterItem.class, "25")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       BeautyFilterItem uBeautyFilte = y.y(p0.mBeautyFilterItemList, new j(p1)).orNull();
       if (uBeautyFilte != null) {
          if (uBeautyFilte.isDoubleSeekEnable()) {
             if (TextUtils.n(uBeautyFilte.mLeftPart.getSerializedKey(), p1)) {
                BeautyFilterItem.setFilterValue(p0, p2, uBeautyFilte.mLeftPart);
                return;
             }else if(TextUtils.n(uBeautyFilte.mRightPart.getSerializedKey(), p1)){
                BeautyFilterItem.setFilterValue(p0, p2, uBeautyFilte.mRightPart);
                return;
             }
          }
          BeautyFilterItem.setFilterValue(p0, p2, uBeautyFilte);
       }
       return;
    }
    public BeautyFilterItem clone(){
       Object obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          BeautyFilterItem uBeautyFilte = super.clone();
          return uBeautyFilte;
       }catch(java.lang.CloneNotSupportedException e0){
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int getBeautyMode(){
       int i;
       BeautyFilterItem obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBeautyMode;
       if (obj != -1) {
          return obj;
       }
       Integer integer = BeautyFilterItem.sDefaultBeautyModeMap.get(Integer.valueOf(this.mId));
       obj = (integer == null)? this.mBeautyMode: integer.intValue();
       return obj;
    }
    public g getBeautyPartGroup(){
       return this.mBeautifyGroupInfo;
    }
    public int getConfigType(){
       return this.mCategory;
    }
    public List getDeformModeList(){
       List obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mDeformModeList)) {
          return this.mDeformModeList;
       }
       obj = BeautyFilterItem.sDefaultDeformModeMap.get(Integer.valueOf(this.mId));
       if (obj == null) {
          obj = Collections.emptyList();
       }
       return obj;
    }
    public float getFilterValue(int p0,int p1){
       int seekBarEndVa;
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BeautyFilterItem.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (this.getSeekBarStartValue() < 0 && this.getSeekBarEndValue() > 0) {
          if (p0 > 0) {
             seekBarEndVa = this.getSeekBarEndValue();
             p0 = Math.abs(p0);
          }else {
             seekBarEndVa = this.getSeekBarStartValue();
             p0 = Math.abs(p0);
          }
          return ((float)(seekBarEndVa * p0) / (float)p1);
       }else {
          return ((float)this.getSeekBarStartValue() + ((float)((this.getSeekBarEndValue() - this.getSeekBarStartValue()) * p0) / (float)p1));
       }
    }
    public int getItemId(){
       return this.mId;
    }
    public String getLoggerName(){
       return this.mLogName;
    }
    public int getSeekBarEndValue(){
       Object obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.round((this.mMaxValue * 100.00f));
    }
    public int getSeekBarStartValue(){
       Object obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.round((this.mMinValue * 100.00f));
    }
    public String getSerializedKey(){
       BeautyFilterItem tmSerialized;
       String obj = PatchProxy.apply(null, this, BeautyFilterItem.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.mSerializedKey))? BeautyFilterItem.getDefaultSerializedKey(this.mId): this.mSerializedKey;
       return obj;
    }
    public int getShowLevel(){
       if (this.mId == -2) {
          return 1;
       }
       return 2;
    }
    public final float getUIFilterValue(BeautifyConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautyFilterItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (!this.isDoubleSeekEnable()) {
          return BeautyFilterItem.getFilterValue(p0, this);
       }
       float filterValue = BeautyFilterItem.getFilterValue(p0, this.mLeftPart);
       if (filterValue > 0) {
          return (- filterValue);
       }
       return BeautyFilterItem.getFilterValue(p0, this.mRightPart);
    }
    public int getUIProgressValue(float p0,int p1){
       int i;
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, BeautyFilterItem.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.isDoubleSeekEnable()) {
          i = (p0 > 0)? Math.round((((float)p1 * Math.abs(p0)) / (this.mRightPart.mMaxValue * 100.00f))): Math.round((((float)p1 * Math.abs(p0)) / ((- this.mLeftPart.mMaxValue) * 100.00f)));
          return i;
       }else if(p0 > 0){
          i = Math.round((((float)p1 * Math.abs(p0)) / (this.mMaxValue * 100.00f)));
       }else {
          i = Math.round((((float)p1 * Math.abs(p0)) / (this.mMinValue * 100.00f)));
       }
       return i;
    }
    public final int getUIProgressValue(BeautifyConfig p0,int p1){
       if (PatchProxy.isSupport(BeautyFilterItem.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, BeautyFilterItem.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return 0;
       }else if(this.isDoubleSeekEnable()){
          float filterValue = BeautyFilterItem.getFilterValue(p0, this.mLeftPart);
          if (filterValue > 0) {
             return this.getUIProgressValue((- filterValue), p1);
          }else {
             return this.getUIProgressValue(BeautyFilterItem.getFilterValue(p0, this.mRightPart), p1);
          }
       }else {
          return this.getUIProgressValue(BeautyFilterItem.getFilterValue(p0, this.getItemId()), p1);
       }
    }
    public boolean isDoubleSeekEnable(){
       boolean b = (this.mLeftPart != null && this.mRightPart != null)? true: false;
       return b;
    }
    public void setUIFilterValue(BeautifyConfig p0,float p1){
       if (PatchProxy.isSupport(BeautyFilterItem.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BeautyFilterItem.class, "6")) {
          return;
       }
       if (this.isDoubleSeekEnable()) {
          float f = 0;
          if (p1 - f < 0) {
             BeautyFilterItem.setFilterValue(p0, f, this.mRightPart);
             BeautyFilterItem.setFilterValue(p0, (- p1), this.mLeftPart);
          }else {
             BeautyFilterItem.setFilterValue(p0, f, this.mLeftPart);
             BeautyFilterItem.setFilterValue(p0, p1, this.mRightPart);
          }
       }else {
          BeautyFilterItem.setFilterValue(p0, p1, this);
       }
       return;
    }
}
