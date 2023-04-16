package com.facebook.react.uimanager.ReactShadowNodeImpl;
import ze.x;
import ze.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lg.b;
import com.facebook.yoga.a;
import lg.c;
import ze.l0;
import vd.a;
import ze.e1;
import lg.g;
import com.facebook.yoga.b;
import java.util.Arrays;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.facebook.react.uimanager.NativeKind;
import od.a;
import java.lang.Float;
import java.lang.Iterable;
import com.facebook.react.uimanager.j;
import ze.n;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Number;
import com.facebook.yoga.YogaDirection;
import com.facebook.react.bridge.JavaOnlyArray;
import ze.y;
import ze.k0;
import com.facebook.yoga.YogaEdge;
import lg.i;
import ze.z;
import ze.n0;
import com.facebook.yoga.YogaAlign;
import lg.a;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaWrap;
import com.facebook.yoga.YogaJustify;
import lg.e;
import com.facebook.yoga.YogaOverflow;
import lg.d;
import com.facebook.yoga.YogaPositionType;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.k$d;
import java.util.Iterator;
import java.util.Map$Entry;

public class ReactShadowNodeImpl implements x	// class@001323
{
    public int mAbsoluteX;
    public int mAbsoluteY;
    public ArrayList mChildren;
    public final l0 mDefaultPadding;
    public boolean mHasSetSnapShotShadowTree;
    public Integer mHeightMeasureSpec;
    public boolean mIsBindingVirtualNode;
    public boolean mIsLayoutOnly;
    public k0 mKdsListNodeWrapperRegistry;
    public y mKdsListRootNodeWrapper;
    public int mLayoutCount;
    public ReactShadowNodeImpl mLayoutParent;
    public long mLayoutTime;
    public JavaOnlyArray mMoveOutFixedChildrenTags;
    public ArrayList mNativeChildren;
    public ReactShadowNodeImpl mNativeParent;
    public boolean mNodeUpdated;
    public int mOriginalParentTag;
    public final float[] mPadding;
    public final boolean[] mPaddingIsPercent;
    public ReactShadowNodeImpl mParent;
    public int mReactTag;
    public int mRootTag;
    public int mScreenHeight;
    public int mScreenWidth;
    public int mScreenX;
    public int mScreenY;
    public boolean mShouldNotifyOnLayout;
    public z mStylesMap;
    public int mSyncRenderDataCellRootTag;
    public int mSyncRenderDataTag;
    public n0 mThemedContext;
    public int mTotalNativeChildren;
    public String mViewClassName;
    public Integer mWidthMeasureSpec;
    public g mYogaNode;
    public static final b sYogaConfig;

    static {
       b uob = PatchProxy.apply(null, null, a0.class, "1");
       if (uob != PatchProxyResult.class) {
       }else if(a0.a == null){
          a uoa = new a();
          a0.a = uoa;
          uoa.e(0);
          a0.a.h(true);
       }
       uob = a0.a;
       ReactShadowNodeImpl.sYogaConfig = uob;
    }
    public void ReactShadowNodeImpl(){
       super();
       this.mNodeUpdated = true;
       this.mTotalNativeChildren = 0;
       float[] uofloatArray = new float[9];
       this.mPadding = uofloatArray;
       boolean[] uobooleanArr = new boolean[9];
       this.mPaddingIsPercent = uobooleanArr;
       this.mOriginalParentTag = 0;
       JavaOnlyArray javaOnlyArra = null;
       this.mMoveOutFixedChildrenTags = javaOnlyArra;
       this.mIsBindingVirtualNode = false;
       this.mStylesMap = javaOnlyArra;
       this.mSyncRenderDataTag = 0;
       this.mSyncRenderDataCellRootTag = 0;
       this.mKdsListRootNodeWrapper = javaOnlyArra;
       this.mKdsListNodeWrapperRegistry = javaOnlyArra;
       this.mHasSetSnapShotShadowTree = false;
       this.mDefaultPadding = new l0(0);
       if (!this.isVirtual()) {
          g og = e1.a().q();
          if (og == null) {
             og = new b(ReactShadowNodeImpl.sYogaConfig);
          }
          this.mYogaNode = og;
          og.h0(this);
          Arrays.fill(uofloatArray, Float.NaN);
       }else {
          this.mYogaNode = javaOnlyArra;
       }
       return;
    }
    public void addChildAt(ReactShadowNodeImpl p0,int p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactShadowN, "8")) {
          return;
       }
       if (this.mChildren == null) {
          this.mChildren = new ArrayList(4);
       }
       this.mChildren.add(p1, p0);
       p0.mParent = this;
       if (this.mYogaNode != null && !this.isYogaLeafNode()) {
          reactShadowN = p0.mYogaNode;
          if (reactShadowN != null) {
             this.mYogaNode.a(reactShadowN, p1);
          }else {
             throw new RuntimeException("Cannot add a child that doesn\'t have a YogaNode to a parent without a measure function! \(Trying to add a \'"+p0.toString()+"\' to a \'"+this.toString()+"\'\)");
          }
       }
       this.markUpdated();
       int totalNativeN = p0.getTotalNativeNodeContributionToParent();
       this.mTotalNativeChildren = this.mTotalNativeChildren + totalNativeN;
       this.updateNativeChildrenCountInParent(totalNativeN);
       return;
    }
    public void addChildAt(x p0,int p1){
       this.addChildAt(p0, p1);
    }
    public final void addNativeChildAt(ReactShadowNodeImpl p0,int p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactShadowN, "24")) {
          return;
       }
       boolean b = true;
       boolean b1 = (this.getNativeKind() == NativeKind.PARENT)? true: false;
       a.a(b1);
       if (p0.getNativeKind() == NativeKind.NONE) {
          b = false;
       }
       a.a(b);
       if (this.mNativeChildren == null) {
          this.mNativeChildren = new ArrayList(4);
       }
       this.mNativeChildren.add(p1, p0);
       p0.mNativeParent = this;
       return;
    }
    public void addNativeChildAt(x p0,int p1){
       this.addNativeChildAt(p0, p1);
    }
    public void calculateLayout(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "20")) {
          return;
       }
       this.calculateLayout(Float.NaN, Float.NaN);
       return;
    }
    public void calculateLayout(float p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "21")) {
          return;
       }
       this.mYogaNode.b(p0, p1);
       return;
    }
    public Iterable calculateLayoutOnChildren(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ReactShadowNodeImpl.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isVirtualAnchor()) {
          objArray = this.mChildren;
       }
       return objArray;
    }
    public void dirty(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "6")) {
          return;
       }
       if (!this.isVirtual()) {
          this.mYogaNode.e();
       }else if(this.getParent() != null){
          this.getParent().dirty();
       }
       return;
    }
    public boolean dispatchUpdates(float p0,float p1,j p2,n p3){
       if (PatchProxy.isSupport(ReactShadowNodeImpl.class)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), p2, p3, this, ReactShadowNodeImpl.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.mNodeUpdated != null) {
          this.onCollectExtraUpdates(p2);
       }
       boolean b = false;
       if (this.hasNewLayout()) {
          float layoutX = this.getLayoutX();
          float layoutY = this.getLayoutY();
          p0 = p0 + layoutX;
          int i = Math.round(p0);
          p1 = p1 + layoutY;
          int i1 = Math.round(p1);
          int i2 = Math.round(layoutX);
          int i3 = Math.round(layoutY);
          int i4 = Math.round((p0 + this.getLayoutWidth())) - i;
          int i5 = Math.round((p1 + this.getLayoutHeight())) - i1;
          int i6 = 1;
          if (i2 == this.mScreenX && (i3 == this.mScreenY && (i4 != this.mScreenWidth || i5 != this.mScreenHeight))) {
             b = true;
          }
          this.mScreenX = i2;
          this.mScreenY = i3;
          this.mScreenWidth = i4;
          this.mScreenHeight = i5;
          this.mAbsoluteX = i;
          this.mAbsoluteY = i1;
          if (b) {
             this.mLayoutCount = this.mLayoutCount + i6;
             if (p3 != null) {
                if (!PatchProxy.applyVoidOneRefs(this, p3, n.class, "8")) {
                   p3.e(this);
                }
             }else {
                p2.i(this.getParent().getReactTag(), this.getReactTag(), this.getScreenX(), this.getScreenY(), this.getScreenWidth(), this.getScreenHeight());
             }
          }
       }
    label_00b8 :
       return b;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "91")) {
          return;
       }
       ReactShadowNodeImpl tmYogaNode = this.mYogaNode;
       if (tmYogaNode != null) {
          tmYogaNode.a0();
          e1.a().a(this.mYogaNode);
       }
       return;
    }
    public int getAbsoluteX(){
       return this.mAbsoluteX;
    }
    public int getAbsoluteY(){
       return this.mAbsoluteY;
    }
    public final ReactShadowNodeImpl getChildAt(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactShadowN, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       reactShadowN = this.mChildren;
       if (reactShadowN != null) {
          return reactShadowN.get(p0);
       }else {
          throw new ArrayIndexOutOfBoundsException("Index "+p0+" out of bounds: node has no children");
       }
    }
    public x getChildAt(int p0){
       return this.getChildAt(p0);
    }
    public final int getChildCount(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mChildren;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public Integer getHeightMeasureSpec(){
       return this.mHeightMeasureSpec;
    }
    public String getHierarchyInfo(){
       StringBuilder obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       this.getHierarchyInfoWithIndentation(obj, 0);
       return obj;
    }
    public final void getHierarchyInfoWithIndentation(StringBuilder p0,int p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactShadowN, "90")) {
          return;
       }
       int i = 0;
       for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
          p0 = p0+"  ";
       }
       p0 = p0+"<"+this.getClass().getSimpleName()+" view=\'"+this.getViewClass()+"\' tag="+this.getReactTag();
       p0 = (this.mYogaNode != null)? p0+" layout=\'x:"+this.getScreenX()+" y:"+this.getScreenY()+" w:"+this.getLayoutWidth()+" h:"+this.getLayoutHeight()+"\'": p0+"\(virtual node\)";
       p0 = p0+">\n";
       if (!this.getChildCount()) {
          return;
       }else {
          for (; i < this.getChildCount(); i = i + 1) {
             int i2 = p1 + 1;
             this.getChildAt(i).getHierarchyInfoWithIndentation(p0, i2);
          }
          return;
       }
    }
    public int getLayoutCount(){
       return this.mLayoutCount;
    }
    public final YogaDirection getLayoutDirection(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mYogaNode.w();
    }
    public final float getLayoutHeight(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mYogaNode.x();
    }
    public final ReactShadowNodeImpl getLayoutParent(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLayoutParent;
       if (obj == null) {
          obj = this.getNativeParent();
       }
       return obj;
    }
    public x getLayoutParent(){
       return this.getLayoutParent();
    }
    public long getLayoutTime(){
       return this.mLayoutTime;
    }
    public final float getLayoutWidth(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mYogaNode.A();
    }
    public final float getLayoutX(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mYogaNode.B();
    }
    public final float getLayoutY(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mYogaNode.C();
    }
    public JavaOnlyArray getMovedOutFixedChildTags(){
       return this.mMoveOutFixedChildrenTags;
    }
    public final int getNativeChildCount(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mNativeChildren;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public NativeKind getNativeKind(){
       NativeKind obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isVirtual() || this.isLayoutOnly()) {
          obj = NativeKind.NONE;
       }else if(this.hoistNativeChildren()){
          obj = NativeKind.LEAF;
       }else {
          obj = NativeKind.PARENT;
       }
       return obj;
    }
    public final int getNativeOffsetForChild(ReactShadowNodeImpl p0){
       RuntimeException obj = PatchProxy.applyOneRefs(p0, this, ReactShadowNodeImpl.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       int i1 = 0;
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          ReactShadowNodeImpl childAt = this.getChildAt(i);
          if (p0 == childAt) {
             obj = 1;
             break ;
          }else {
             i1 = i1 + childAt.getTotalNativeNodeContributionToParent();
          }
       }
       if (obj) {
          return i1;
       }
       throw new RuntimeException("Child "+p0.getReactTag()+" was not a child of "+this.mReactTag);
    }
    public int getNativeOffsetForChild(x p0){
       return this.getNativeOffsetForChild(p0);
    }
    public final ReactShadowNodeImpl getNativeParent(){
       return this.mNativeParent;
    }
    public x getNativeParent(){
       return this.getNativeParent();
    }
    public y getNodeWrapper(){
       return this.mKdsListRootNodeWrapper;
    }
    public k0 getNodeWrapperRegistry(){
       return this.mKdsListNodeWrapperRegistry;
    }
    public int getOriginalParentTag(){
       return this.mOriginalParentTag;
    }
    public final float getPadding(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactShadowN, "75");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.mYogaNode.z(YogaEdge.fromInt(p0));
    }
    public final ReactShadowNodeImpl getParent(){
       return this.mParent;
    }
    public x getParent(){
       return this.getParent();
    }
    public final int getReactTag(){
       return this.mReactTag;
    }
    public final int getRootTag(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = (this.mRootTag != null)? true: false;
       a.a(b);
       return this.mRootTag;
    }
    public int getScreenHeight(){
       return this.mScreenHeight;
    }
    public int getScreenWidth(){
       return this.mScreenWidth;
    }
    public int getScreenX(){
       return this.mScreenX;
    }
    public int getScreenY(){
       return this.mScreenY;
    }
    public boolean getSelfLayoutFlag(){
       return false;
    }
    public final i getStyleHeight(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mYogaNode.t();
    }
    public final i getStylePadding(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactShadowN, "76");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mYogaNode.K(YogaEdge.fromInt(p0));
    }
    public final i getStyleWidth(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mYogaNode.P();
    }
    public z getStylesMap(){
       return this.mStylesMap;
    }
    public int getSyncRenderDataCellRootTag(){
       return this.mSyncRenderDataCellRootTag;
    }
    public int getSyncRenderDataTag(){
       return this.mSyncRenderDataTag;
    }
    public final n0 getThemedContext(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mThemedContext;
       a.c(obj);
       return obj;
    }
    public final int getTotalNativeChildren(){
       return this.mTotalNativeChildren;
    }
    public final int getTotalNativeNodeContributionToParent(){
       NativeKind obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getNativeKind();
       ReactShadowNodeImpl reactShadowN = 1;
       if (obj == NativeKind.NONE) {
          reactShadowN = this.mTotalNativeChildren;
       }else if(obj == NativeKind.LEAF){
          reactShadowN = reactShadowN + this.mTotalNativeChildren;
       }
       return reactShadowN;
    }
    public final String getViewClass(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mViewClassName;
       a.c(obj);
       return obj;
    }
    public Integer getWidthMeasureSpec(){
       return this.mWidthMeasureSpec;
    }
    public final boolean hasNewLayout(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mYogaNode;
       boolean b = (obj != null && obj.R())? true: false;
       return b;
    }
    public boolean hasSetSnapShotShadowTree(){
       return this.mHasSetSnapShotShadowTree;
    }
    public final boolean hasUnseenUpdates(){
       return this.mNodeUpdated;
    }
    public final boolean hasUpdates(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mNodeUpdated == null && (this.hasNewLayout() || this.isDirty()))? true: false;
       return b;
    }
    public boolean hoistNativeChildren(){
       return false;
    }
    public void increaseLayoutCount(){
       this.mLayoutCount = this.mLayoutCount + 1;
    }
    public final int indexOf(ReactShadowNodeImpl p0){
       ReactShadowNodeImpl obj = PatchProxy.applyOneRefs(p0, this, ReactShadowNodeImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mChildren;
       int i = (obj == null)? -1: obj.indexOf(p0);
       return i;
    }
    public int indexOf(x p0){
       return this.indexOf(p0);
    }
    public final int indexOfNativeChild(ReactShadowNodeImpl p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactShadowNodeImpl.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.c(this.mNativeChildren);
       return this.mNativeChildren.indexOf(p0);
    }
    public int indexOfNativeChild(x p0){
       return this.indexOfNativeChild(p0);
    }
    public boolean isBindingVirtualNode(){
       return this.mIsBindingVirtualNode;
    }
    public boolean isDataViewShadowNode(){
       return false;
    }
    public boolean isDescendantOf(ReactShadowNodeImpl p0){
       ReactShadowNodeImpl obj = PatchProxy.applyOneRefs(p0, this, ReactShadowNodeImpl.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       for (obj = this.getParent(); obj != null; obj = obj.getParent()) {
          if (obj == p0) {
             b = true;
             break ;
          }else {
          }
       }
       return b;
    }
    public boolean isDescendantOf(x p0){
       return this.isDescendantOf(p0);
    }
    public final boolean isDirty(){
       ReactShadowNodeImpl obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mYogaNode;
       boolean b = (obj != null && obj.U())? true: false;
       return b;
    }
    public boolean isFixedNode(){
       return false;
    }
    public final boolean isLayoutOnly(){
       return this.mIsLayoutOnly;
    }
    public boolean isMeasureDefined(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mYogaNode.V();
    }
    public boolean isSyncRenderDataRelativeNode(){
       boolean b = (this.mSyncRenderDataTag != null)? true: false;
       return b;
    }
    public boolean isVirtual(){
       return false;
    }
    public boolean isVirtualAnchor(){
       return false;
    }
    public boolean isYogaLeafNode(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isMeasureDefined();
    }
    public final void markLayoutSeen(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "23")) {
          return;
       }
       ReactShadowNodeImpl tmYogaNode = this.mYogaNode;
       if (tmYogaNode != null) {
          tmYogaNode.X();
       }
       return;
    }
    public final void markUpdateSeen(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "4")) {
          return;
       }
       this.mNodeUpdated = false;
       if (this.hasNewLayout()) {
          this.markLayoutSeen();
       }
       return;
    }
    public void markUpdated(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "5")) {
          return;
       }
       if (this.mNodeUpdated != null) {
          return;
       }
       this.mNodeUpdated = true;
       ReactShadowNodeImpl parent = this.getParent();
       if (parent != null) {
          parent.markUpdated();
       }
       return;
    }
    public void onAfterUpdateTransaction(){
    }
    public void onBeforeLayout(n p0){
    }
    public void onCollectExtraUpdates(j p0){
    }
    public final void removeAllNativeChildren(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "26")) {
          return;
       }
       ReactShadowNodeImpl tmNativeChil = this.mNativeChildren;
       if (tmNativeChil != null) {
          for (int i = tmNativeChil.size() - 1; i >= 0; i = i - 1) {
             this.mNativeChildren.get(i).mNativeParent = null;
          }
          this.mNativeChildren.clear();
       }
       return;
    }
    public void removeAndDisposeAllChildren(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactShadowNodeImpl.class, "13")) {
          return;
       }
       if (!this.getChildCount()) {
          return;
       }
       int i = 0;
       for (int i1 = this.getChildCount() - 1; i1 >= 0; i1 = i1 - 1) {
          if (this.mYogaNode != null && !this.isYogaLeafNode()) {
             this.mYogaNode.Z(i1);
          }
          ReactShadowNodeImpl childAt = this.getChildAt(i1);
          childAt.mParent = objArray;
          i = i + childAt.getTotalNativeNodeContributionToParent();
          childAt.dispose();
       }
       ReactShadowNodeImpl tmChildren = this.mChildren;
       a.c(tmChildren);
       tmChildren.clear();
       this.markUpdated();
       this.mTotalNativeChildren = this.mTotalNativeChildren - i;
       this.updateNativeChildrenCountInParent((- i));
       return;
    }
    public ReactShadowNodeImpl removeChildAt(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactShadowN, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       reactShadowN = this.mChildren;
       if (reactShadowN != null) {
          reactShadowN = reactShadowN.remove(p0);
          reactShadowN.mParent = null;
          if (this.mYogaNode != null && !this.isYogaLeafNode()) {
             this.mYogaNode.Z(p0);
          }
          this.markUpdated();
          p0 = reactShadowN.getTotalNativeNodeContributionToParent();
          this.mTotalNativeChildren = this.mTotalNativeChildren - p0;
          this.updateNativeChildrenCountInParent((- p0));
          return reactShadowN;
       }else {
          throw new ArrayIndexOutOfBoundsException("Index "+p0+" out of bounds: node has no children");
       }
    }
    public x removeChildAt(int p0){
       return this.removeChildAt(p0);
    }
    public final ReactShadowNodeImpl removeNativeChildAt(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactShadowN, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.c(this.mNativeChildren);
       ReactShadowNodeImpl reactShadowN1 = this.mNativeChildren.remove(p0);
       reactShadowN1.mNativeParent = null;
       return reactShadowN1;
    }
    public x removeNativeChildAt(int p0){
       return this.removeNativeChildAt(p0);
    }
    public void resetLayoutCount(){
       this.mLayoutCount = 0;
    }
    public void resetMovedOutFixedChildTags(JavaOnlyArray p0){
       this.mMoveOutFixedChildrenTags = p0;
    }
    public void setAlignContent(YogaAlign p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "68")) {
          return;
       }
       this.mYogaNode.b0(p0);
       return;
    }
    public void setAlignItems(YogaAlign p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "67")) {
          return;
       }
       this.mYogaNode.c0(p0);
       return;
    }
    public void setAlignSelf(YogaAlign p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "66")) {
          return;
       }
       this.mYogaNode.d0(p0);
       return;
    }
    public void setBaselineFunction(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "86")) {
          return;
       }
       this.mYogaNode.f0(p0);
       return;
    }
    public void setBindingVirtualNode(boolean p0){
       this.mIsBindingVirtualNode = p0;
    }
    public void setBorder(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "81")) {
          return;
       }
       this.mYogaNode.g0(YogaEdge.fromInt(p0), p1);
       return;
    }
    public void setDefaultPadding(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "77")) {
          return;
       }
       this.mDefaultPadding.c(p0, p1);
       this.updatePadding();
       return;
    }
    public void setDisplay(YogaDisplay p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "71")) {
          return;
       }
       this.mYogaNode.j0(p0);
       return;
    }
    public void setFlex(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "57")) {
          return;
       }
       this.mYogaNode.k0(p0);
       return;
    }
    public void setFlexBasis(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "60")) {
          return;
       }
       this.mYogaNode.l0(p0);
       return;
    }
    public void setFlexBasisAuto(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "61")) {
          return;
       }
       this.mYogaNode.m0();
       return;
    }
    public void setFlexBasisPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "62")) {
          return;
       }
       this.mYogaNode.n0(p0);
       return;
    }
    public void setFlexDirection(YogaFlexDirection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "64")) {
          return;
       }
       this.mYogaNode.o0(p0);
       return;
    }
    public void setFlexGrow(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "58")) {
          return;
       }
       this.mYogaNode.p0(p0);
       return;
    }
    public void setFlexShrink(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "59")) {
          return;
       }
       this.mYogaNode.q0(p0);
       return;
    }
    public void setFlexWrap(YogaWrap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "65")) {
          return;
       }
       this.mYogaNode.R0(p0);
       return;
    }
    public final void setIsLayoutOnly(boolean p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, reactShadowN, "29")) {
          return;
       }
       boolean b = true;
       boolean b1 = (this.getParent() == null)? true: false;
       a.b(b1, "Must remove from no opt parent first");
       b1 = (this.mNativeParent == null)? true: false;
       a.b(b1, "Must remove from native parent first");
       if (this.getNativeChildCount()) {
          b = false;
       }
       a.b(b, "Must remove all native children first");
       this.mIsLayoutOnly = p0;
       return;
    }
    public void setJustifyContent(YogaJustify p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "69")) {
          return;
       }
       this.mYogaNode.v0(p0);
       return;
    }
    public void setLayoutDirection(YogaDirection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "40")) {
          return;
       }
       this.mYogaNode.i0(p0);
       return;
    }
    public final void setLayoutParent(ReactShadowNodeImpl p0){
       this.mLayoutParent = p0;
    }
    public void setLayoutParent(x p0){
       this.setLayoutParent(p0);
    }
    public void setLayoutTime(long p0){
       this.mLayoutTime = p0;
    }
    public void setLocalData(Object p0){
    }
    public void setMargin(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "72")) {
          return;
       }
       this.mYogaNode.w0(YogaEdge.fromInt(p0), p1);
       return;
    }
    public void setMarginAuto(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reactShadowN, "74")) {
          return;
       }
       this.mYogaNode.x0(YogaEdge.fromInt(p0));
       return;
    }
    public void setMarginPercent(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "73")) {
          return;
       }
       this.mYogaNode.y0(YogaEdge.fromInt(p0), p1);
       return;
    }
    public void setMeasureFunction(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "87")) {
          return;
       }
       this.mYogaNode.D0(p0);
       return;
    }
    public void setMeasureSpecs(int p0,int p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, reactShadowN, "92")) {
          return;
       }
       this.mWidthMeasureSpec = Integer.valueOf(p0);
       this.mHeightMeasureSpec = Integer.valueOf(p1);
       return;
    }
    public void setMovedOutFixedChildTag(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reactShadowN, "85")) {
          return;
       }
       if (this.mMoveOutFixedChildrenTags == null) {
          this.mMoveOutFixedChildrenTags = new JavaOnlyArray();
       }
       this.mMoveOutFixedChildrenTags.pushInt(p0);
       return;
    }
    public void setOriginalParentTag(int p0){
       this.mOriginalParentTag = p0;
    }
    public void setOverflow(YogaOverflow p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "70")) {
          return;
       }
       this.mYogaNode.I0(p0);
       return;
    }
    public void setPadding(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "78")) {
          return;
       }
       this.mPadding[p0] = p1;
       p1[p0] = false;
       this.updatePadding();
       return;
    }
    public void setPaddingPercent(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "79")) {
          return;
       }
       this.mPadding[p0] = p1;
       this.mPaddingIsPercent[p0] = d.a(p1) ^ 0x01;
       this.updatePadding();
       return;
    }
    public void setPosition(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "82")) {
          return;
       }
       this.mYogaNode.L0(YogaEdge.fromInt(p0), p1);
       return;
    }
    public void setPositionPercent(int p0,float p1){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactShadowN, "83")) {
          return;
       }
       this.mYogaNode.M0(YogaEdge.fromInt(p0), p1);
       return;
    }
    public void setPositionType(YogaPositionType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "84")) {
          return;
       }
       this.mYogaNode.N0(p0);
       return;
    }
    public void setReactTag(int p0){
       this.mReactTag = p0;
    }
    public final void setRootTag(int p0){
       this.mRootTag = p0;
    }
    public void setShouldNotifyOnLayout(boolean p0){
       this.mShouldNotifyOnLayout = p0;
    }
    public void setSnapShotShadowTree(y p0,k0 p1){
       this.mKdsListRootNodeWrapper = p0;
       this.mKdsListNodeWrapperRegistry = p1;
       this.mHasSetSnapShotShadowTree = true;
    }
    public void setSnapShotShadowTree(boolean p0){
       this.mHasSetSnapShotShadowTree = p0;
    }
    public void setStyleAspectRatio(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "63")) {
          return;
       }
       this.mYogaNode.e0(p0);
       return;
    }
    public void setStyleHeight(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "50")) {
          return;
       }
       this.mYogaNode.r0(p0);
       return;
    }
    public void setStyleHeightAuto(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "52")) {
          return;
       }
       this.mYogaNode.s0();
       return;
    }
    public void setStyleHeightPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "51")) {
          return;
       }
       this.mYogaNode.t0(p0);
       return;
    }
    public void setStyleMaxHeight(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "55")) {
          return;
       }
       this.mYogaNode.z0(p0);
       return;
    }
    public void setStyleMaxHeightPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "56")) {
          return;
       }
       this.mYogaNode.A0(p0);
       return;
    }
    public void setStyleMaxWidth(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "47")) {
          return;
       }
       this.mYogaNode.B0(p0);
       return;
    }
    public void setStyleMaxWidthPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "48")) {
          return;
       }
       this.mYogaNode.C0(p0);
       return;
    }
    public void setStyleMinHeight(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "53")) {
          return;
       }
       this.mYogaNode.E0(p0);
       return;
    }
    public void setStyleMinHeightPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "54")) {
          return;
       }
       this.mYogaNode.F0(p0);
       return;
    }
    public void setStyleMinWidth(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "45")) {
          return;
       }
       this.mYogaNode.G0(p0);
       return;
    }
    public void setStyleMinWidthPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "46")) {
          return;
       }
       this.mYogaNode.H0(p0);
       return;
    }
    public void setStyleWidth(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "42")) {
          return;
       }
       this.mYogaNode.O0(p0);
       return;
    }
    public void setStyleWidthAuto(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "44")) {
          return;
       }
       this.mYogaNode.P0();
       return;
    }
    public void setStyleWidthPercent(float p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, reactShadowN, "43")) {
          return;
       }
       this.mYogaNode.Q0(p0);
       return;
    }
    public void setSyncRenderDataCellRootTag(int p0){
       this.mSyncRenderDataCellRootTag = p0;
    }
    public void setSyncRenderDataTag(int p0){
       this.mSyncRenderDataTag = p0;
    }
    public void setThemedContext(n0 p0){
       this.mThemedContext = p0;
    }
    public final void setViewClassName(String p0){
       this.mViewClassName = p0;
    }
    public final boolean shouldNotifyOnLayout(){
       return this.mShouldNotifyOnLayout;
    }
    public void synchronouslyUpdateLayoutInfoForKdsList(ViewManager p0,View p1){
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReactShadowNodeImpl.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "["+this.mViewClassName+" "+this.getReactTag()+"]";
    }
    public final void updateNativeChildrenCountInParent(int p0){
       ReactShadowNodeImpl reactShadowN = ReactShadowNodeImpl.class;
       if (PatchProxy.isSupport(reactShadowN) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reactShadowN, "14")) {
          return;
       }
       if (this.getNativeKind() != NativeKind.PARENT) {
          for (reactShadowN = this.getParent(); reactShadowN != null; reactShadowN = reactShadowN.getParent()) {
             int i = reactShadowN.mTotalNativeChildren + p0;
             reactShadowN.mTotalNativeChildren = i;
             if (reactShadowN.getNativeKind() != NativeKind.PARENT) {
             }
          }
       }
       return;
    }
    public final void updatePadding(){
       if (PatchProxy.applyVoid(null, this, ReactShadowNodeImpl.class, "80")) {
          return;
       }
       int i = 0;
       int i1 = 8;
       while (i <= i1) {
          if (i && (i != 2 && (i == 4 || i == 5))) {
             if (d.a(this.mPadding[i]) && (d.a(this.mPadding[6]) && d.a(this.mPadding[i1]))) {
                this.mYogaNode.J0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
             }else if(this.mPaddingIsPercent[i]){
                this.mYogaNode.K0(YogaEdge.fromInt(i), this.mPadding[i]);
             }else {
                this.mYogaNode.J0(YogaEdge.fromInt(i), this.mPadding[i]);
             }
          }else if(i == 1 || i == 3){
             if (d.a(this.mPadding[i]) && (d.a(this.mPadding[7]) && d.a(this.mPadding[i1]))) {
                this.mYogaNode.J0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
             }else {
                goto label_009d ;
             }
          }else if(d.a(this.mPadding[i])){
             this.mYogaNode.J0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
          }else {
             goto label_009d ;
          }
          i = i + 1;
       }
       return;
    }
    public final void updateProperties(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactShadowNodeImpl.class, "15")) {
          return;
       }
       if (this.mStylesMap == null) {
          this.mStylesMap = p0;
       }else {
          WritableMap writableMap = Arguments.createMap();
          writableMap.merge(this.mStylesMap.a);
          writableMap.merge(p0.a);
          this.mStylesMap = new z(writableMap);
       }
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, k.class, "4")) {
          k$d uod = k.d(this.getClass());
          Iterator entryIterato = p0.a.getEntryIterator();
          while (entryIterato.hasNext()) {
             Map$Entry uEntry = entryIterato.next();
             String key = uEntry.getKey();
             uod.setProperty(this, key, uEntry.getValue());
          }
       }
       this.onAfterUpdateTransaction();
       return;
    }
}
