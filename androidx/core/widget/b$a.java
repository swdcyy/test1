package androidx.core.widget.b$a;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.ArrayList;
import android.app.Activity;
import java.util.Iterator;
import android.text.Editable;
import android.view.Menu;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import android.view.MenuItem;
import java.lang.CharSequence;
import android.view.ActionMode;

public class b$a implements ActionMode$Callback	// class@000730
{
    public final ActionMode$Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;

    public void b$a(ActionMode$Callback p0,TextView p1){
       super();
       this.a = p0;
       this.b = p1;
       this.f = false;
    }
    public final Intent a(){
       return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
    public final Intent b(ResolveInfo p0,TextView p1){
       p0 = p0.activityInfo;
       return this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (this.d(p1) ^ 0x01)).setClassName(p0.packageName, p0.name);
    }
    public final List c(Context p0,PackageManager p1){
       ArrayList uArrayList = new ArrayList();
       if (!p0 instanceof Activity) {
          return uArrayList;
       }
       Iterator iterator = p1.queryIntentActivities(this.a(), 0).iterator();
       while (iterator.hasNext()) {
          ResolveInfo resolveInfo = iterator.next();
          if (this.e(resolveInfo, p0)) {
             uArrayList.add(resolveInfo);
          }
       }
       return uArrayList;
    }
    public final boolean d(TextView p0){
       boolean b = (p0 instanceof Editable && (p0.onCheckIsTextEditor() && p0.isEnabled()))? true: false;
       return b;
    }
    public final boolean e(ResolveInfo p0,Context p1){
       boolean b = true;
       if ((p1.getPackageName()).equals(p0.activityInfo.packageName)) {
          return b;
       }
       p0 = p0.activityInfo;
       if (p0.exported == null) {
          return false;
       }
       ActivityInfo permission = p0.permission;
       if (permission != null && p1.checkSelfPermission(permission)) {
          b = false;
       }
       return b;
    }
    public final void f(Menu p0){
       Class uClass;
       b$a td;
       int i;
       MenuItem item;
       Object[] objArray;
       List list;
       int i1;
       List list1;
       ResolveInfo resolveInfo;
       int i2;
       Context context = this.b.getContext();
       PackageManager packageManag = context.getPackageManager();
       String str = "removeItemAt";
       if (this.f == null) {
          this.f = true;
          try{
             uClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
             this.c = uClass;
             Class[] uClassArray = new Class[true];
             uClassArray[0] = Integer.TYPE;
             this.d = uClass.getDeclaredMethod(str, uClassArray);
             this.e = true;
          }catch(java.lang.ClassNotFoundException e0){
             uClass = null;
             this.c = uClass;
             this.d = uClass;
             this.e = false;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public boolean onActionItemClicked(ActionMode p0,MenuItem p1){
       return this.a.onActionItemClicked(p0, p1);
    }
    public boolean onCreateActionMode(ActionMode p0,Menu p1){
       return this.a.onCreateActionMode(p0, p1);
    }
    public void onDestroyActionMode(ActionMode p0){
       this.a.onDestroyActionMode(p0);
    }
    public boolean onPrepareActionMode(ActionMode p0,Menu p1){
       this.f(p1);
       return this.a.onPrepareActionMode(p0, p1);
    }
}
