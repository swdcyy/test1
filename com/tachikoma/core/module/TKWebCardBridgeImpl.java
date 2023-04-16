package com.tachikoma.core.module.TKWebCardBridgeImpl;
import tx4.t;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.bridge.d;
import com.tkruntime.v8.V8Function;

public class TKWebCardBridgeImpl extends TKBaseNativeModule implements t	// class@000dcc
{

    public void TKWebCardBridgeImpl(f p0){
       super(p0);
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, TKWebCardBridgeImpl.class, "6")) {
          return;
       }
       this.d().close();
       return;
    }
    public void convert(){
       if (PatchProxy.applyVoid(null, this, TKWebCardBridgeImpl.class, "4")) {
          return;
       }
       this.d().convert();
       return;
    }
    public final t d(){
       Object obj = PatchProxy.apply(null, this, TKWebCardBridgeImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTKJSContext().o;
    }
    public String getData(){
       Object obj = PatchProxy.apply(null, this, TKWebCardBridgeImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().getData();
    }
    public void handleAdUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "10")) {
          return;
       }
       this.d().handleAdUrl(p0);
       return;
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, TKWebCardBridgeImpl.class, "11")) {
          return;
       }
       this.d().hide();
       return;
    }
    public void log(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "8")) {
          return;
       }
       this.d().log(p0);
       return;
    }
    public void nonActionbarClick(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "5")) {
          return;
       }
       this.d().nonActionbarClick(p0);
       return;
    }
    public void pageStatus(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "2")) {
          return;
       }
       this.d().pageStatus(p0);
       return;
    }
    public void registerProgressListener(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "3")) {
          return;
       }
       this.d().registerProgressListener(p0);
       return;
    }
    public void trace(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKWebCardBridgeImpl.class, "9")) {
          return;
       }
       this.d().trace(p0);
       return;
    }
}
