package com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import z1.d;
import java.lang.Number;

public class BaseOrderUIModel	// class@00085a
{
    public int a;
    public Object b;
    public boolean c;
    public static Set d;

    static {
       BaseOrderUIModel.d = new BaseOrderUIModel$1();
    }
    public void BaseOrderUIModel(){
       super();
       this.c = true;
    }
    public void BaseOrderUIModel(int p0,Object p1){
       super(p0, p1, true);
    }
    public void BaseOrderUIModel(int p0,Object p1,boolean p2){
       super();
       this.c = true;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static boolean d(int p0){
       BaseOrderUIModel uBaseOrderUI = BaseOrderUIModel.class;
       if (PatchProxy.isSupport(uBaseOrderUI)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uBaseOrderUI, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return BaseOrderUIModel.d.contains(Integer.valueOf(p0));
    }
    public static BaseOrderUIModel e(int p0){
       BaseOrderUIModel uBaseOrderUI = BaseOrderUIModel.class;
       if (PatchProxy.isSupport(uBaseOrderUI)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uBaseOrderUI, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BaseOrderUIModel(p0, null);
    }
    public static BaseOrderUIModel f(int p0,Object p1){
       BaseOrderUIModel uBaseOrderUI = BaseOrderUIModel.class;
       if (PatchProxy.isSupport(uBaseOrderUI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uBaseOrderUI, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BaseOrderUIModel(p0, p1);
    }
    public static BaseOrderUIModel g(int p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(BaseOrderUIModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, BaseOrderUIModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BaseOrderUIModel(p0, p1, p2);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, BaseOrderUIModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (BaseOrderUIModel.d(this.a) || this.a == 4)? true: false;
       return b;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, BaseOrderUIModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return BaseOrderUIModel.d(this.a);
    }
    public boolean c(){
       boolean b = (this.a == 4)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseOrderUIModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a || !d.a(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, BaseOrderUIModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.a),this.b};
       return d.b(obj);
    }
}
