package com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo$Style;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class ComponentInfo implements Serializable	// class@001951
{
    public Object data;
    public String downgradeName;
    public String id;
    public String name;
    public String renderUrl;
    public int resourceType;
    public int span;
    public ComponentInfo$Style style;
    public int viewType;
    public static final ComponentInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ComponentInfo.Companion = new ComponentInfo$a(null);
    }
    public void ComponentInfo(){
       super();
       this.id = "";
       this.span = 1;
    }
    public static void getResourceType$annotations(){
    }
    public static void getViewType$annotations(){
    }
    public final Object getData(){
       return this.data;
    }
    public final String getDowngradeName(){
       return this.downgradeName;
    }
    public final String getId(){
       return this.id;
    }
    public final String getName(){
       return this.name;
    }
    public final String getRenderUrl(){
       return this.renderUrl;
    }
    public final int getResourceType(){
       return this.resourceType;
    }
    public final int getSpan(){
       return this.span;
    }
    public final ComponentInfo$Style getStyle(){
       return this.style;
    }
    public final int getViewType(){
       return this.viewType;
    }
    public final boolean isValid(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(this.name)) {
          return false;
       }
       if (this.viewType != null && TextUtils.x(this.renderUrl)) {
          return false;
       }
       return true;
    }
    public final String renderType(){
       String str;
       ComponentInfo tviewType = this.viewType;
       if (tviewType != 1) {
          str = (tviewType != 2)? "NATIVE": "TK";
       }else {
          str = "KRN";
       }
       return str;
    }
    public final void setData(Object p0){
       this.data = p0;
    }
    public final void setDowngradeName(String p0){
       this.downgradeName = p0;
    }
    public final void setId(String p0){
       this.id = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setRenderUrl(String p0){
       this.renderUrl = p0;
    }
    public final void setResourceType(int p0){
       this.resourceType = p0;
    }
    public final void setSpan(int p0){
       this.span = p0;
    }
    public final void setStyle(ComponentInfo$Style p0){
       this.style = p0;
    }
    public final void setViewType(int p0){
       this.viewType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ComponentInfo\(name="+this.name+", id=\'"+this.id+"\'\)";
    }
}
