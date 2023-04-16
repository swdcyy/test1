package bd8.a;
import ma8.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ma8.g;
import org.json.JSONObject;
import zi8.d0;
import zi8.p;
import com.mini.d;
import java.lang.StringBuilder;
import org.json.JSONException;
import android.widget.EditText;
import java.lang.Boolean;
import android.text.Editable;
import zi8.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class a	// class@00032b
{
    public final String a;
    public final int b;
    public final i c;

    public void a(i p0){
       super();
       this.a = "<textArea>|<input>";
       this.b = 8;
       this.c = p0;
    }
    public void a(i p0,String p1,int p2,int p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       JSONObject jSONObject = new JSONObject();
       d0.m(jSONObject, "inputId", p1);
       d0.m(jSONObject, "nodeId", Integer.valueOf(p2));
       d0.m(jSONObject, "oldContentHeight", Integer.valueOf(p3));
       d0.m(jSONObject, "newContentHeight", Integer.valueOf(p4));
       p0.d(p0.h(), "onContentOverflow", jSONObject);
       if (p.d() && d.f()) {
          d.a("<textArea>|<input>", "sendHeightOverflowEvent mid = "+p1+" json: "+jSONObject.toString());
       }
       return;
    }
    public void b(String p0,int p1,String p2,g p3){
       JSONObject obj;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a.class, "5")) {
          return;
       }
       if (p3 == null) {
          return;
       }
       try{
          try{
             obj = new JSONObject();
             obj.put("inputId", p0);
             obj.put("nodeId", p1);
             obj.put("value", p2);
          label_003c :
             if (p.d() && d.f()) {
                d.a("<textArea>|<input>", "input 或者 textarea 发送.onKeyboardComplete 事件"+obj);
             }
             this.c.d(p3, "onKeyboardComplete", obj);
             return;
          }catch(org.json.JSONException e9){
             int i = obj;
          }
          e9.printStackTrace();
          obj = null;
          goto label_003c ;
       }catch(org.json.JSONException e9){
          goto label_0038 ;
       }
    }
    public void c(int p0,String p1,int p2,String p3){
       JSONObject obj;
       String str1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, a.class, "2")) {
          return;
       }
       String str = null;
       try{
          try{
             obj = new JSONObject();
             obj.put("inputId", p1);
             obj.put("nodeId", p2);
             obj.put("value", p3);
             p1 = "confirmType";
             p0 = p0 & 0x00ff;
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 != 5) {
                         str1 = (p0 != 6)? "default": "done";
                      }else {
                         str1 = "next";
                      }
                   }else {
                      str1 = "send";
                   }
                }else {
                   str1 = "search";
                }
             }else {
                str1 = "go";
             }
             obj.put(p1, str1);
          label_0063 :
             if (p.d() && d.f()) {
                d.a("<textArea>|<input>", "input 或者 textarea 向JS发送.onKeyboardConfirm "+obj);
             }
             a tc = this.c;
             tc.d(tc.h(), "onKeyboardConfirm", obj);
             return;
          }catch(org.json.JSONException e9){
             int i = obj;
          }
          e9.printStackTrace();
          obj = str;
          goto label_0063 ;
       }catch(org.json.JSONException e9){
          goto label_005f ;
       }
    }
    public void d(String p0,int p1){
       JSONObject obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       String str = null;
       try{
          try{
             obj = new JSONObject();
             obj.put("inputId", p0);
             obj.put("nodeId", p1);
             obj.put("height", 0);
          label_0034 :
             if (p.d() && d.f()) {
                d.a("<textArea>|<input>", "input或者 textArea发送.onKeyboardShow 事件 "+obj);
             }
             a tc = this.c;
             tc.d(tc.h(), "onKeyboardShow", obj);
             return;
          }catch(org.json.JSONException e4){
             int i = obj;
          }
          e4.printStackTrace();
          obj = str;
          goto label_0034 ;
       }catch(org.json.JSONException e4){
          goto label_0030 ;
       }
    }
    public void e(EditText p0,String p1,int p2,int p3,int p4,boolean p5,g p6){
       int i1;
       JSONObject obj1;
       a uoa = this;
       object oobject = p1;
       int i = p3;
       object oobject1 = p6;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{p0,oobject,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5),oobject1};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "4")) {
             return;
          }
       }
       if (oobject1 == null) {
          return;
       }else {
          int selectionSta = p0.getSelectionStart();
          String str = p0.getText().toString();
          int b = e0.b(p0);
          if (p5 && b) {
             if (d.f()) {
                d.a("<textArea>|<input>", "sendOnKeyboardValueChangeEvent: 当前键盘还未编辑完，不发送事件");
             }
             return;
          }else if(PatchProxy.isSupport(uoa1)){
             CharSequence obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p3), Integer.valueOf(p4), this, a.class, "8");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
             label_0088 :
                obj = p0.getText().subSequence(i, (p4 + i));
                if (TextUtils.isEmpty(obj)) {
                   if (d.f()) {
                      d.a("<textArea>|<input>", "EditText 正在输入退格键。。。");
                   }
                   i1 = 8;
                }else {
                   i1 = obj.subSequence((obj.length() - 1), obj.length()).charAt(0);
                }
             }
          }else {
             goto label_0088 ;
          }
          if (d.f()) {
             d.a("<textArea>|<input>", "sendOnKeyboardValueChangeEvent: keycode是 "+i1);
          }
          String str1 = null;
          try{
             try{
                obj1 = new JSONObject();
                obj1.put("inputId", oobject);
                obj1.put("nodeId", p2);
                obj1.put("cursor", selectionSta);
                obj1.put("value", str);
                obj1.put("keyCode", i1);
             label_00fc :
                if (p.d() && d.f()) {
                   d.a("<textArea>|<input>", "input 或者 textarea 发送 onKeyboardValueChange事件 "+obj1);
                }
                uoa.c.d(oobject1, "onKeyboardValueChange", obj1);
                return;
             }catch(org.json.JSONException e0){
                b = obj1;
             }
             e0.printStackTrace();
             obj1 = str1;
             goto label_00fc ;
          }catch(org.json.JSONException e0){
             goto label_00f8 ;
          }
       }
    }
}
