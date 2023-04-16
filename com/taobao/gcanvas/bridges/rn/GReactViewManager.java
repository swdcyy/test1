package com.taobao.gcanvas.bridges.rn.GReactViewManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.taobao.gcanvas.bridges.rn.GReactTextureView;
import java.util.UUID;
import java.lang.String;
import android.content.Context;
import java.util.Map;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.ReadableArray;

public class GReactViewManager extends SimpleViewManager	// class@000dfb
{

    public void GReactViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public GReactTextureView createViewInstance(n0 p0){
       return new GReactTextureView(p0, UUID.randomUUID().toString());
    }
    public Map getCommandsMap(){
       return super.getCommandsMap();
    }
    public String getName(){
       return "GCanvasView";
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(GReactTextureView p0){
       super.onDropViewInstance(p0);
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(GReactTextureView p0,int p1,ReadableArray p2){
       super.receiveCommand(p0, p1, p2);
    }
}
