package com.kwai.video.westeros.UIInteractionHandler;
import com.kwai.video.westeros.helpers.ValidationChecker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.video.westeros.models.UIInteractionResponse$Builder;
import com.kwai.video.westeros.models.UIInteractionResponse;
import com.kwai.video.westeros.models.UIInteractionResponseType;
import java.lang.Iterable;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.westeros.models.Point;
import com.kwai.video.westeros.UIInteractionHandler$PointTransformDelegate;

public class UIInteractionHandler	// class@000e66
{
    public final ValidationChecker checker;
    public final long nativeHandler;
    public UIInteractionHandler$PointTransformDelegate transformDelegate;
    public static final String TAG = "UIInteractionHandler";

    public void UIInteractionHandler(long p0,ValidationChecker p1){
       super();
       this.nativeHandler = this.nativeCreate(p0);
       this.checker = p1;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, UIInteractionHandler.class, "5")) {
          return;
       }
       this.transformDelegate = null;
       this.nativeDestroy(this.nativeHandler);
       return;
    }
    public native final long nativeCreate(long p0);
    public native final void nativeDestroy(long p0);
    public native final void nativeOnUIResponse(long p0,byte[] p1);
    public void onTouchBegan(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIInteractionHandler.class, "1")) {
          return;
       }
       UIInteractionResponse uIInteractio = UIInteractionResponse.newBuilder().setType(UIInteractionResponseType.kResponseTouchBegin).addAllPoints(this.updatePoints(p0)).build();
       if (this.checker.isValid()) {
          this.nativeOnUIResponse(this.nativeHandler, uIInteractio.toByteArray());
       }
       return;
    }
    public void onTouchEnded(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIInteractionHandler.class, "3")) {
          return;
       }
       UIInteractionResponse uIInteractio = UIInteractionResponse.newBuilder().setType(UIInteractionResponseType.kResponseTouchEnd).addAllPoints(this.updatePoints(p0)).build();
       if (this.checker.isValid()) {
          this.nativeOnUIResponse(this.nativeHandler, uIInteractio.toByteArray());
       }
       return;
    }
    public void onTouchMoved(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UIInteractionHandler.class, "2")) {
          return;
       }
       UIInteractionResponse uIInteractio = UIInteractionResponse.newBuilder().setType(UIInteractionResponseType.kResponseTouchMoved).addAllPoints(this.updatePoints(p0)).build();
       if (this.checker.isValid()) {
          this.nativeOnUIResponse(this.nativeHandler, uIInteractio.toByteArray());
       }
       return;
    }
    public final List updatePoints(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, UIInteractionHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.transformDelegate == null) {
          return p0;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(this.transformDelegate.transformPoint(iterator.next()));
       }
       return obj;
    }
}
