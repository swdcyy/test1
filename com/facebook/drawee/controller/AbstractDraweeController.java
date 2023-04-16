package com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import tb.a$a;
import zb.a$a;
import java.lang.Object;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import tb.a;
import java.util.concurrent.Executor;
import java.lang.String;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import ub.b;
import ab.e;
import com.facebook.drawee.controller.AbstractDraweeController$c;
import com.facebook.drawee.controller.ForwardingControllerListener;
import kd.b;
import com.facebook.fresco.ui.common.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;
import ub.a;
import kb.c;
import android.graphics.Rect;
import ac.b;
import zb.a;
import java.lang.Class;
import java.lang.System;
import kc.b;
import android.net.Uri;
import tb.c;
import com.facebook.drawee.components.DraweeEventTracker$Event;
import ac.c;
import cb.a;
import java.lang.Integer;
import java.lang.Throwable;
import cb.c;
import com.facebook.fresco.ui.common.b$a;
import yb.a;
import xb.t$b;
import xb.s;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.Objects;
import java.lang.Math;
import android.view.ViewConfiguration;
import ub.c;
import java.lang.Boolean;
import com.facebook.drawee.controller.AbstractDraweeController$a;
import xb.h;
import com.facebook.drawee.controller.AbstractDraweeController$b;
import kb.e;
import ab.d$b;
import ab.d;

public abstract class AbstractDraweeController implements a, a$a, a$a	// class@001085
{
    public Object mCallerContext;
    public String mContentDescription;
    public b mControllerListener;
    public ForwardingControllerListener2 mControllerListener2;
    public Drawable mControllerOverlay;
    public c mControllerViewportVisibilityListener;
    public c mDataSource;
    public final a mDeferredReleaser;
    public Drawable mDrawable;
    public final DraweeEventTracker mEventTracker;
    public Object mFetchedImage;
    public a mGestureDetector;
    public boolean mHasFetchFailed;
    public String mId;
    public boolean mIsAttached;
    public boolean mIsRequestSubmitted;
    public boolean mIsVisibleInViewportHint;
    public boolean mJustConstructed;
    public b mLoggingListener;
    public boolean mRetainImageOnFailure;
    public c mRetryManager;
    public c mSettableDraweeHierarchy;
    public final Executor mUiThreadImmediateExecutor;
    public static final Map COMPONENT_EXTRAS;
    public static final Map SHORTCUT_EXTRAS;
    public static final Class TAG;

    static {
       AbstractDraweeController.COMPONENT_EXTRAS = ImmutableMap.of("component_tag", "drawee");
       AbstractDraweeController.SHORTCUT_EXTRAS = ImmutableMap.of("origin", "memory_bitmap", "origin_sub", "shortcut");
       AbstractDraweeController.TAG = AbstractDraweeController.class;
    }
    public void AbstractDraweeController(a p0,Executor p1,String p2,Object p3){
       super();
       this.mEventTracker = DraweeEventTracker.a();
       this.mControllerListener2 = new ForwardingControllerListener2();
       this.mJustConstructed = true;
       this.mDeferredReleaser = p0;
       this.mUiThreadImmediateExecutor = p1;
       this.init(p2, p3);
    }
    public void addControllerListener(b p0){
       e.d(p0);
       AbstractDraweeController tmController = this.mControllerListener;
       if (tmController instanceof AbstractDraweeController$c) {
          tmController.addListener(p0);
          return;
       }else if(tmController != null){
          if (b.d()) {
             b.a("AbstractDraweeController#createInternal");
          }
          AbstractDraweeController$c uoc = new AbstractDraweeController$c();
          uoc.addListener(tmController);
          uoc.addListener(p0);
          if (b.d()) {
             b.b();
          }
          this.mControllerListener = uoc;
          return;
       }else {
          this.mControllerListener = p0;
          return;
       }
    }
    public void addControllerListener2(b p0){
       this.mControllerListener2.addListener(p0);
    }
    public abstract Drawable createDrawable(Object p0);
    public Animatable getAnimatable(){
       AbstractDraweeController tmDrawable = this.mDrawable;
       if (tmDrawable instanceof Animatable) {
       }else {
          tmDrawable = null;
       }
       return tmDrawable;
    }
    public Object getCachedImage(){
       return null;
    }
    public Object getCallerContext(){
       return this.mCallerContext;
    }
    public String getContentDescription(){
       return this.mContentDescription;
    }
    public b getControllerListener(){
       AbstractDraweeController tmController = this.mControllerListener;
       if (tmController == null) {
          tmController = a.a;
       }
       return tmController;
    }
    public b getControllerListener2(){
       return this.mControllerListener2;
    }
    public Drawable getControllerOverlay(){
       return this.mControllerOverlay;
    }
    public abstract c getDataSource();
    public final Rect getDimensions(){
       AbstractDraweeController tmSettableDr = this.mSettableDraweeHierarchy;
       if (tmSettableDr == null) {
          return null;
       }
       return tmSettableDr.getBounds();
    }
    public a getGestureDetector(){
       return this.mGestureDetector;
    }
    public b getHierarchy(){
       return this.mSettableDraweeHierarchy;
    }
    public String getId(){
       return this.mId;
    }
    public String getImageClass(Object p0){
       p0 = (p0 != null)? p0.getClass().getSimpleName(): "<null>";
       return p0;
    }
    public int getImageHash(Object p0){
       return System.identityHashCode(p0);
    }
    public abstract Object getImageInfo(Object p0);
    public b getLoggingListener(){
       return this.mLoggingListener;
    }
    public Uri getMainUri(){
       return null;
    }
    public c getRetryManager(){
       if (this.mRetryManager == null) {
          this.mRetryManager = new c();
       }
       return this.mRetryManager;
    }
    public synchronized final void init(String p0,Object p1){
       AbstractDraweeController tmDeferredRe;
       if (b.d()) {
          b.a("AbstractDraweeController#init");
       }
       this.mEventTracker.b(DraweeEventTracker$Event.ON_INIT_CONTROLLER);
       if (this.mJustConstructed == null) {
          tmDeferredRe = this.mDeferredReleaser;
          if (tmDeferredRe != null) {
             tmDeferredRe.a(this);
          }
       }
       this.mIsAttached = false;
       this.mIsVisibleInViewportHint = false;
       this.releaseFetch();
       this.mRetainImageOnFailure = false;
       tmDeferredRe = this.mRetryManager;
       if (tmDeferredRe != null) {
          tmDeferredRe.a();
       }
       tmDeferredRe = this.mGestureDetector;
       if (tmDeferredRe != null) {
          tmDeferredRe.a();
          this.mGestureDetector.c(this);
       }
       tmDeferredRe = this.mControllerListener;
       c uoc = null;
       if (tmDeferredRe instanceof AbstractDraweeController$c) {
          tmDeferredRe.clearListeners();
       }else {
          this.mControllerListener = uoc;
       }
       this.mControllerViewportVisibilityListener = uoc;
       tmDeferredRe = this.mSettableDraweeHierarchy;
       if (tmDeferredRe != null) {
          tmDeferredRe.reset();
          this.mSettableDraweeHierarchy.d(uoc);
          this.mSettableDraweeHierarchy = uoc;
       }
       this.mControllerOverlay = uoc;
       if (a.l(2)) {
          a.p(AbstractDraweeController.TAG, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.mId, p0);
       }
       this.mId = p0;
       this.mCallerContext = p1;
       if (b.d()) {
          b.b();
       }
       if (this.mLoggingListener != null) {
          this.setUpLoggingListener();
       }
       return;
    }
    public void initialize(String p0,Object p1){
       this.init(p0, p1);
       this.mJustConstructed = false;
    }
    public final boolean isExpectedDataSource(String p0,c p1){
       boolean b = true;
       if (p1 == null && this.mDataSource == null) {
          return b;
       }
       if (!p0.equals(this.mId) || (p1 != this.mDataSource || this.mIsRequestSubmitted == null)) {
          b = false;
       }
       return b;
    }
    public final void logMessageAndFailure(String p0,Throwable p1){
       if (a.l(2)) {
          a.q(AbstractDraweeController.TAG, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.mId, p0, p1);
       }
       return;
    }
    public final void logMessageAndImage(String p0,Object p1){
       int i = 2;
       if (a.l(i)) {
          Class tAG = AbstractDraweeController.TAG;
          Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(this)),this.mId,p0,this.getImageClass(p1),Integer.valueOf(this.getImageHash(p1))};
          if (a.a.d(i)) {
             a.a.v(a.j(tAG), a.i("controller %x %s: %s: image: %s %x", objArray));
          }
       }
       return;
    }
    public final b$a obtainExtras(Map p0,Map p1,Uri p2){
       s os1;
       AbstractDraweeController tmSettableDr = this.mSettableDraweeHierarchy;
       s os = null;
       if (tmSettableDr instanceof a) {
          String str = String.valueOf(tmSettableDr.l());
          AbstractDraweeController tmSettableDr1 = this.mSettableDraweeHierarchy;
          int i = 2;
          if (tmSettableDr1.q(i)) {
             os = tmSettableDr1.o(i).h;
          }
          os = str;
          os1 = os;
       }else {
          os1 = os;
       }
       Map cOMPONENT_EX = AbstractDraweeController.COMPONENT_EXTRAS;
       Map sHORTCUT_EXT = AbstractDraweeController.SHORTCUT_EXTRAS;
       Rect dimensions = this.getDimensions();
       Object callerContex = this.getCallerContext();
       b$a uoa = new b$a();
       if (dimensions != null) {
          uoa.g = dimensions.width();
          uoa.h = dimensions.height();
       }
       uoa.i = os;
       if (os1 != null) {
          uoa.j = os1.x;
          uoa.k = os1.y;
       }
       uoa.e = callerContex;
       uoa.f = p2;
       uoa.c = p0;
       uoa.d = p1;
       uoa.b = sHORTCUT_EXT;
       uoa.a = cOMPONENT_EX;
       return uoa;
    }
    public final b$a obtainExtras(c p0,Object p1,Uri p2){
       Map map = (p0 == null)? null: p0.getExtras();
       return this.obtainExtras(map, this.obtainExtrasFromImage(p1), p2);
    }
    public abstract Map obtainExtrasFromImage(Object p0);
    public void onAttach(){
       if (b.d()) {
          b.a("AbstractDraweeController#onAttach");
       }
       if (a.l(2)) {
          Class tAG = AbstractDraweeController.TAG;
          Integer integer = Integer.valueOf(System.identityHashCode(this));
          AbstractDraweeController tmId = this.mId;
          String str = (this.mIsRequestSubmitted != null)? "request already submitted": "request needs submit";
          a.p(tAG, "controller %x %s: onAttach: %s", integer, tmId, str);
       }
       this.mEventTracker.b(DraweeEventTracker$Event.ON_ATTACH_CONTROLLER);
       e.d(this.mSettableDraweeHierarchy);
       this.mDeferredReleaser.a(this);
       this.mIsAttached = true;
       if (this.mIsRequestSubmitted == null) {
          this.submitRequest();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public boolean onClick(){
       if (a.l(2)) {
          a.o(AbstractDraweeController.TAG, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.mId);
       }
       if (this.shouldRetryOnTap()) {
          AbstractDraweeController tmRetryManag = this.mRetryManager;
          tmRetryManag.c = tmRetryManag.c + 1;
          this.mSettableDraweeHierarchy.reset();
          this.submitRequest();
          return 1;
       }else {
          return false;
       }
    }
    public void onDetach(){
       if (b.d()) {
          b.a("AbstractDraweeController#onDetach");
       }
       if (a.l(2)) {
          a.o(AbstractDraweeController.TAG, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.mId);
       }
       this.mEventTracker.b(DraweeEventTracker$Event.ON_DETACH_CONTROLLER);
       this.mIsAttached = false;
       this.mDeferredReleaser.c(this);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void onFailureInternal(String p0,c p1,Throwable p2,boolean p3){
       boolean b;
       if (b.d()) {
          b.a("AbstractDraweeController#onFailureInternal");
       }
       if (!this.isExpectedDataSource(p0, p1)) {
          this.logMessageAndFailure("ignore_old_datasource @ onFailure", p2);
          p1.close();
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          AbstractDraweeController tmEventTrack = this.mEventTracker;
          DraweeEventTracker$Event oN_DATASOURC = (p3)? DraweeEventTracker$Event.ON_DATASOURCE_FAILURE: DraweeEventTracker$Event.ON_DATASOURCE_FAILURE_INT;
          tmEventTrack.b(oN_DATASOURC);
          if (p3) {
             this.logMessageAndFailure("final_failed @ onFailure", p2);
             this.mDataSource = null;
             b = true;
             this.mHasFetchFailed = b;
             if (this.mRetainImageOnFailure != null) {
                AbstractDraweeController tmDrawable = this.mDrawable;
                if (tmDrawable != null) {
                   this.mSettableDraweeHierarchy.f(tmDrawable, 0x3f800000, b);
                }else if(this.shouldRetryOnTap()){
                   this.mSettableDraweeHierarchy.b(p2);
                }else {
                   this.mSettableDraweeHierarchy.a(p2);
                }
             }else {
                goto label_004c ;
             }
             this.reportFailure(p2, p1);
          }else {
             this.logMessageAndFailure("intermediate_failed @ onFailure", p2);
             this.reportIntermediateFailure(p2);
          }
          if (b.d()) {
             b.b();
          }
          return;
       }
    }
    public void onImageLoadedFromCacheImmediately(String p0,Object p1){
    }
    public void onNewResultInternal(String p0,c p1,Object p2,float p3,boolean p4,boolean p5,boolean p6){
       if (b.d()) {
          b.a("AbstractDraweeController#onNewResultInternal");
       }
       if (!this.isExpectedDataSource(p0, p1)) {
          this.logMessageAndImage("ignore_old_datasource @ onNewResult", p2);
          this.releaseImage(p2);
          p1.close();
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          AbstractDraweeController tmEventTrack = this.mEventTracker;
          DraweeEventTracker$Event oN_DATASOURC = (p4)? DraweeEventTracker$Event.ON_DATASOURCE_RESULT: DraweeEventTracker$Event.ON_DATASOURCE_RESULT_INT;
          try{
             tmEventTrack.b(oN_DATASOURC);
             Drawable uDrawable = this.createDrawable(p2);
             AbstractDraweeController tmFetchedIma = this.mFetchedImage;
             AbstractDraweeController tmDrawable = this.mDrawable;
             this.mFetchedImage = p2;
             this.mDrawable = uDrawable;
             if (p4) {
                this.logMessageAndImage("set_final_result @ onNewResult", p2);
                this.mDataSource = null;
                this.mSettableDraweeHierarchy.f(uDrawable, 0x3f800000, p5);
                this.reportSuccess(p0, p2, p1);
             }else if(p6){
                this.logMessageAndImage("set_temporary_result @ onNewResult", p2);
                this.mSettableDraweeHierarchy.f(uDrawable, 0x3f800000, p5);
                this.reportSuccess(p0, p2, p1);
             }else {
                this.logMessageAndImage("set_intermediate_result @ onNewResult", p2);
                this.mSettableDraweeHierarchy.f(uDrawable, p3, p5);
                this.reportIntermediateSet(p0, p2);
             }
             if (tmDrawable != null && tmDrawable != uDrawable) {
                this.releaseDrawable(tmDrawable);
             }
             if (tmFetchedIma != null && tmFetchedIma != p2) {
                this.logMessageAndImage("release_previous_result @ onNewResult", tmFetchedIma);
                this.releaseImage(tmFetchedIma);
             }
             if (b.d()) {
                b.b();
             }
             return;
          }catch(java.lang.Exception e9){
             this.logMessageAndImage("drawable_failed @ onNewResult", p2);
             this.releaseImage(p2);
             this.onFailureInternal(p0, p1, e9, p4);
             if (b.d()) {
                b.b();
             }
             return;
          }
       }
    }
    public void onProgressUpdateInternal(String p0,c p1,float p2,boolean p3){
       if (!this.isExpectedDataSource(p0, p1)) {
          this.logMessageAndFailure("ignore_old_datasource @ onProgress", null);
          p1.close();
          return;
       }else if(!p3){
          this.mSettableDraweeHierarchy.e(p2, false);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       a a;
       int i = 2;
       if (a.l(i)) {
          a.p(AbstractDraweeController.TAG, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.mId, p0);
       }
       AbstractDraweeController tmGestureDet = this.mGestureDetector;
       boolean b = false;
       if (tmGestureDet == null) {
          return b;
       }else if(tmGestureDet.c != null || this.shouldHandleGesture()){
          tmGestureDet = this.mGestureDetector;
          Objects.requireNonNull(tmGestureDet);
          int action = p0.getAction();
          if (action) {
             if (action != 1) {
                if (action != i) {
                   if (action == 3) {
                      tmGestureDet.c = b;
                      tmGestureDet.d = b;
                   }
                }else if(Math.abs((p0.getX() - tmGestureDet.f)) - tmGestureDet.b > 0 || Math.abs((p0.getY() - tmGestureDet.g)) - tmGestureDet.b > 0){
                   tmGestureDet.d = b;
                }
             }else {
                tmGestureDet.c = b;
                if (Math.abs((p0.getX() - tmGestureDet.f)) - tmGestureDet.b > 0 || Math.abs((p0.getY() - tmGestureDet.g)) - tmGestureDet.b > 0) {
                   tmGestureDet.d = b;
                }
                if (tmGestureDet.d != null && (p0.getEventTime() - tmGestureDet.e) - (long)ViewConfiguration.getLongPressTimeout() <= 0) {
                   a = tmGestureDet.a;
                   if (a != null) {
                      a.onClick();
                   }
                }
                tmGestureDet.d = b;
             }
          }else {
             tmGestureDet.c = true;
             tmGestureDet.d = true;
             tmGestureDet.e = p0.getEventTime();
             tmGestureDet.f = p0.getX();
             tmGestureDet.g = p0.getY();
          }
          return true;
       }else {
          return b;
       }
    }
    public void onViewportVisibilityHint(boolean p0){
       AbstractDraweeController tmController = this.mControllerViewportVisibilityListener;
       if (tmController != null) {
          if (p0 && this.mIsVisibleInViewportHint == null) {
             tmController.b(this.mId);
          }else if(!p0 && this.mIsVisibleInViewportHint != null){
             tmController.a(this.mId);
          }
       }
       this.mIsVisibleInViewportHint = p0;
       return;
    }
    public void release(){
       this.mEventTracker.b(DraweeEventTracker$Event.ON_RELEASE_CONTROLLER);
       AbstractDraweeController tmRetryManag = this.mRetryManager;
       if (tmRetryManag != null) {
          tmRetryManag.b();
       }
       tmRetryManag = this.mGestureDetector;
       if (tmRetryManag != null) {
          tmRetryManag.b();
       }
       tmRetryManag = this.mSettableDraweeHierarchy;
       if (tmRetryManag != null) {
          tmRetryManag.reset();
       }
       this.releaseFetch();
       return;
    }
    public abstract void releaseDrawable(Drawable p0);
    public final void releaseFetch(){
       Map extras;
       AbstractDraweeController tmIsRequestS = this.mIsRequestSubmitted;
       this.mIsRequestSubmitted = false;
       this.mHasFetchFailed = false;
       AbstractDraweeController tmDataSource = this.mDataSource;
       c uoc = null;
       if (tmDataSource != null) {
          extras = tmDataSource.getExtras();
          this.mDataSource.close();
          this.mDataSource = uoc;
       }else {
          extras = uoc;
       }
       AbstractDraweeController tmDrawable = this.mDrawable;
       if (tmDrawable != null) {
          this.releaseDrawable(tmDrawable);
       }
       if (this.mContentDescription != null) {
          this.mContentDescription = uoc;
       }
       this.mDrawable = uoc;
       tmDrawable = this.mFetchedImage;
       if (tmDrawable != null) {
          this.logMessageAndImage("release", this.mFetchedImage);
          this.releaseImage(this.mFetchedImage);
          this.mFetchedImage = uoc;
          uoc = this.obtainExtrasFromImage(this.getImageInfo(tmDrawable));
       }
       if (tmIsRequestS != null) {
          this.reportRelease(extras, uoc);
       }
       return;
    }
    public abstract void releaseImage(Object p0);
    public void removeControllerListener(b p0){
       e.d(p0);
       AbstractDraweeController tmController = this.mControllerListener;
       if (tmController instanceof AbstractDraweeController$c) {
          tmController.removeListener(p0);
          return;
       }else if(tmController == p0){
          this.mControllerListener = null;
       }
       return;
    }
    public void removeControllerListener2(b p0){
       this.mControllerListener2.removeListener(p0);
    }
    public final void reportFailure(Throwable p0,c p1){
       this.getControllerListener().onFailure(this.mId, p0);
       this.getControllerListener2().onFailure(this.mId, p0, this.obtainExtras(p1, null, null));
    }
    public final void reportIntermediateFailure(Throwable p0){
       this.getControllerListener().onIntermediateImageFailed(this.mId, p0);
       this.getControllerListener2().onIntermediateImageFailed(this.mId);
    }
    public final void reportIntermediateSet(String p0,Object p1){
       p1 = this.getImageInfo(p1);
       this.getControllerListener().onIntermediateImageSet(p0, p1);
       this.getControllerListener2().onIntermediateImageSet(p0, p1);
    }
    public final void reportRelease(Map p0,Map p1){
       this.getControllerListener().onRelease(this.mId);
       this.getControllerListener2().onRelease(this.mId, this.obtainExtras(p0, p1, null));
    }
    public void reportSubmit(c p0,Object p1){
       this.getControllerListener().onSubmit(this.mId, this.mCallerContext);
       this.getControllerListener2().onSubmit(this.mId, this.mCallerContext, this.obtainExtras(p0, p1, this.getMainUri()));
    }
    public final void reportSuccess(String p0,Object p1,c p2){
       p1 = this.getImageInfo(p1);
       this.getControllerListener().onFinalImageSet(p0, p1, this.getAnimatable());
       this.getControllerListener2().onFinalImageSet(p0, p1, this.obtainExtras(p2, p1, null));
    }
    public void setContentDescription(String p0){
       this.mContentDescription = p0;
    }
    public void setControllerOverlay(Drawable p0){
       this.mControllerOverlay = p0;
       AbstractDraweeController tmSettableDr = this.mSettableDraweeHierarchy;
       if (tmSettableDr != null) {
          tmSettableDr.d(p0);
       }
       return;
    }
    public void setControllerViewportVisibilityListener(c p0){
       this.mControllerViewportVisibilityListener = p0;
    }
    public void setGestureDetector(a p0){
       this.mGestureDetector = p0;
       if (p0 != null) {
          p0.c(this);
       }
       return;
    }
    public void setHierarchy(b p0){
       if (a.l(2)) {
          a.p(AbstractDraweeController.TAG, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.mId, p0);
       }
       AbstractDraweeController tmEventTrack = this.mEventTracker;
       DraweeEventTracker$Event oN_SET_HIERA = (p0 != null)? DraweeEventTracker$Event.ON_SET_HIERARCHY: DraweeEventTracker$Event.ON_CLEAR_HIERARCHY;
       tmEventTrack.b(oN_SET_HIERA);
       if (this.mIsRequestSubmitted != null) {
          this.mDeferredReleaser.a(this);
          this.release();
       }
       tmEventTrack = this.mSettableDraweeHierarchy;
       if (tmEventTrack != null) {
          tmEventTrack.d(null);
          this.mSettableDraweeHierarchy = null;
       }
       if (p0 != null) {
          e.a(Boolean.valueOf(p0 instanceof c));
          this.mSettableDraweeHierarchy = p0;
          p0.d(this.mControllerOverlay);
       }
       if (this.mLoggingListener != null) {
          this.setUpLoggingListener();
       }
       return;
    }
    public void setLoggingListener(b p0){
       this.mLoggingListener = p0;
    }
    public void setRetainImageOnFailure(boolean p0){
       this.mRetainImageOnFailure = p0;
    }
    public final void setUpLoggingListener(){
       AbstractDraweeController tmSettableDr = this.mSettableDraweeHierarchy;
       if (tmSettableDr instanceof a) {
          tmSettableDr.e.v = new AbstractDraweeController$a(this);
       }
       return;
    }
    public boolean shouldHandleGesture(){
       return this.shouldRetryOnTap();
    }
    public final boolean shouldRetryOnTap(){
       boolean b = true;
       if (this.mHasFetchFailed != null) {
          AbstractDraweeController tmRetryManag = this.mRetryManager;
          if (tmRetryManag != null) {
             tmRetryManag = (tmRetryManag.a != null && tmRetryManag.c < tmRetryManag.b)? 1: 0;
             if (tmRetryManag) {
             label_001b :
                return b;
             }
          }
       }
       b = false;
       goto label_001b ;
    }
    public void submitRequest(){
       boolean b;
       if (b.d()) {
          b.a("AbstractDraweeController#submitRequest");
       }
       Object cachedImage = this.getCachedImage();
       c uoc = null;
       b = false;
       boolean b1 = true;
       if (cachedImage != null) {
          if (b.d()) {
             b.a("AbstractDraweeController#submitRequest->cache");
          }
          this.mDataSource = uoc;
          this.mIsRequestSubmitted = b1;
          this.mHasFetchFailed = b;
          this.mEventTracker.b(DraweeEventTracker$Event.ON_SUBMIT_CACHE_HIT);
          this.reportSubmit(this.mDataSource, this.getImageInfo(cachedImage));
          this.onImageLoadedFromCacheImmediately(this.mId, cachedImage);
          this.onNewResultInternal(this.mId, this.mDataSource, cachedImage, 0x3f800000, true, true, true);
          if (b.d()) {
             b.b();
          }
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          this.mEventTracker.b(DraweeEventTracker$Event.ON_DATASOURCE_SUBMIT);
          this.mSettableDraweeHierarchy.e(0, b1);
          this.mIsRequestSubmitted = b1;
          this.mHasFetchFailed = b;
          c dataSource = this.getDataSource();
          this.mDataSource = dataSource;
          this.reportSubmit(dataSource, uoc);
          if (a.l(2)) {
             a.p(AbstractDraweeController.TAG, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.mId, Integer.valueOf(System.identityHashCode(this.mDataSource)));
          }
          this.mDataSource.f(new AbstractDraweeController$b(this, this.mId, this.mDataSource.hasResult()), this.mUiThreadImmediateExecutor);
          if (b.d()) {
             b.b();
          }
          return;
       }
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.c("isAttached", this.mIsAttached);
       uob.c("isRequestSubmitted", this.mIsRequestSubmitted);
       uob.c("hasFetchFailed", this.mHasFetchFailed);
       uob.a("fetchedImage", this.getImageHash(this.mFetchedImage));
       uob.b("events", this.mEventTracker.toString());
       return uob.toString();
    }
}
