package androidx.appcompat.widget.g;
import android.view.View$OnClickListener;
import f2.c;
import android.content.Context;
import androidx.appcompat.widget.SearchView;
import android.app.SearchableInfo;
import java.util.WeakHashMap;
import android.database.Cursor;
import java.lang.String;
import android.os.Bundle;
import java.lang.CharSequence;
import f2.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import androidx.appcompat.widget.g$a;
import android.widget.TextView;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.RuntimeException;
import android.graphics.drawable.Drawable$ConstantState;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.widget.BaseAdapter;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import android.content.ContentResolver;
import java.io.InputStream;
import java.util.List;
import java.lang.Integer;
import androidx.core.content.ContextCompat;
import android.net.Uri$Builder;

public class g extends c implements View$OnClickListener	// class@00064b
{
    public int A;
    public int B;
    public final SearchView o;
    public final SearchableInfo p;
    public final Context q;
    public final WeakHashMap r;
    public final int s;
    public boolean t;
    public int u;
    public ColorStateList v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void g(Context p0,SearchView p1,SearchableInfo p2,WeakHashMap p3){
       super(p0, p1.getSuggestionRowLayout(), null, true);
       this.t = false;
       this.u = 1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.z = -1;
       this.A = -1;
       this.B = -1;
       this.o = p1;
       this.p = p2;
       this.s = p1.getSuggestionCommitIconResId();
       this.q = p0;
       this.r = p3;
    }
    public static String n(Cursor p0,String p1){
       return g.v(p0, p0.getColumnIndex(p1));
    }
    public static String v(Cursor p0,int p1){
       if (p1 == -1) {
          return null;
       }
       try{
          return p0.getString(p1);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public final void A(Cursor p0){
       Bundle extras = (p0 != null)? p0.getExtras(): null;
       if (extras != null) {
          extras.getBoolean("in_progress");
       }
       return;
    }
    public CharSequence a(Cursor p0){
       if (p0 == null) {
          return null;
       }
       String str = g.n(p0, "suggest_intent_query");
       if (str != null) {
          return str;
       }
       if (this.p.shouldRewriteQueryFromData()) {
          str = g.n(p0, "suggest_intent_data");
          if (str != null) {
             return str;
          }
       }
       if (this.p.shouldRewriteQueryFromText()) {
          String str1 = g.n(p0, "suggest_text_1");
          if (str1 != null) {
             return str1;
          }
       }
       return null;
    }
    public void b(Cursor p0){
       if (this.t != null) {
          if (p0 != null) {
             p0.close();
          }
          return;
       }else {
          try{
             super.b(p0);
             if (p0 != null) {
                this.w = p0.getColumnIndex("suggest_text_1");
                this.x = p0.getColumnIndex("suggest_text_2");
                this.y = p0.getColumnIndex("suggest_text_2_url");
                this.z = p0.getColumnIndex("suggest_icon_1");
                this.A = p0.getColumnIndex("suggest_icon_2");
                this.B = p0.getColumnIndex("suggest_flags");
             }
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public Cursor c(CharSequence p0){
       String str = (p0 == null)? "": p0.toString();
       if (!this.o.getVisibility() && !this.o.getWindowVisibility()) {
          try{
             Cursor uCursor = this.u(this.p, str, 50);
             if (uCursor != null) {
                uCursor.getCount();
                return uCursor;
             }
          }catch(java.lang.RuntimeException e0){
          }
       }
       return null;
    }
    public void d(View p0,Context p1,Cursor p2){
       g$a a;
       g$a tag = p0.getTag();
       g tB = this.B;
       int intx = (tB != -1)? p2.getInt(tB): 0;
       if (tag.a != null) {
          this.y(tag.a, g.v(p2, this.w));
       }
       if (tag.b != null) {
          String str = g.v(p2, this.y);
          CharSequence uCharSequenc = (str != null)? this.k(str): g.v(p2, this.x);
          if (TextUtils.isEmpty(uCharSequenc)) {
             a = tag.a;
             if (a != null) {
                a.setSingleLine(false);
                tag.a.setMaxLines(2);
             }
          }else {
             a = tag.a;
             if (a != null) {
                a.setSingleLine(1);
                tag.a.setMaxLines(1);
             }
          }
          this.y(tag.b, uCharSequenc);
       }
       g$a c = tag.c;
       if (c != null) {
          this.x(c, this.s(p2), 4);
       }
       c = tag.d;
       if (c != null) {
          this.x(c, this.t(p2), 8);
       }
       g tu = this.u;
       if (tu == 2 || (tu == 1 && (intx & 1))) {
          tag.e.setVisibility(false);
          tag.e.setTag(tag.a.getText());
          tag.e.setOnClickListener(this);
       }else {
          tag.e.setVisibility(8);
       }
       return;
    }
    public View g(Context p0,Cursor p1,ViewGroup p2){
       View view = super.g(p0, p1, p2);
       view.setTag(new g$a(view));
       view.findViewById(R.id.edit_query).setImageResource(this.s);
       return view;
    }
    public View getDropDownView(int p0,View p1,ViewGroup p2){
       try{
          return super.getDropDownView(p0, p1, p2);
       }catch(java.lang.RuntimeException e2){
          p1 = this.f(this.e, this.d, p2);
          if (p1 != null) {
             p1.getTag().a.setText(e2.toString());
          }
          return p1;
       }
    }
    public View getView(int p0,View p1,ViewGroup p2){
       try{
          return super.getView(p0, p1, p2);
       }catch(java.lang.RuntimeException e2){
          p1 = this.g(this.e, this.d, p2);
          p1.getTag().a.setText(e2.toString());
          return p1;
       }
    }
    public final Drawable j(String p0){
       Drawable$ConstantState uConstantSta = this.r.get(p0);
       if (uConstantSta == null) {
          return null;
       }
       return uConstantSta.newDrawable();
    }
    public final CharSequence k(CharSequence p0){
       if (this.v == null) {
          TypedValue typedValue = new TypedValue();
          this.e.getTheme().resolveAttribute(R.attr.arg_RES_7f040914, typedValue, true);
          this.v = this.e.getResources().getColorStateList(typedValue.resourceId);
       }
       SpannableString spannableStr = new SpannableString(p0);
       TextAppearanceSpan textAppearan = new TextAppearanceSpan(null, 0, 0, this.v, null);
       spannableStr.setSpan(v7, 0, p0.length(), 33);
       return spannableStr;
    }
    public final Drawable l(ComponentName p0){
       int i1;
       PackageManager packageManag = this.e.getPackageManager();
       int i = 128;
       try{
          i1 = 0;
          ActivityInfo activityInfo = packageManag.getActivityInfo(p0, i);
          int iconResource = activityInfo.getIconResource();
          if (!iconResource) {
             return i1;
          }
          Drawable drawable = packageManag.getDrawable(p0.getPackageName(), iconResource, activityInfo.applicationInfo);
          if (drawable != null) {
             return drawable;
          }
          p0.flattenToShortString();
          return i1;
       }catch(android.content.pm.PackageManager$NameNotFoundException e6){
          e6.toString();
          return i1;
       }
    }
    public final Drawable m(ComponentName p0){
       String str = p0.flattenToShortString();
       Drawable uDrawable = null;
       if (this.r.containsKey(str)) {
          Drawable$ConstantState uConstantSta = this.r.get(str);
          if (uConstantSta != null) {
             uDrawable = uConstantSta.newDrawable(this.q.getResources());
          }
          return uDrawable;
       }else {
          Drawable uDrawable1 = this.l(p0);
          if (uDrawable1 != null) {
             uDrawable = uDrawable1.getConstantState();
          }
          this.r.put(str, uDrawable);
          return uDrawable1;
       }
    }
    public void notifyDataSetChanged(){
       super.notifyDataSetChanged();
       this.A(this.getCursor());
    }
    public void notifyDataSetInvalidated(){
       super.notifyDataSetInvalidated();
       this.A(this.getCursor());
    }
    public final Drawable o(){
       Drawable uDrawable = this.m(this.p.getSearchActivity());
       if (uDrawable != null) {
          return uDrawable;
       }
       return this.e.getPackageManager().getDefaultActivityIcon();
    }
    public void onClick(View p0){
       p0 = p0.getTag();
       if (p0 instanceof CharSequence) {
          this.o.U(p0);
       }
       return;
    }
    public final Drawable p(Uri p0){
       String str = null;
       try{
          if (("android.resource").equals(p0.getScheme())) {
             return this.q(p0);
          }
          try{
             InputStream inputStream = this.q.getContentResolver().openInputStream(p0);
             if (inputStream == null) {
                throw new FileNotFoundException("Failed to open "+p0);
             }
             Drawable uDrawable = Drawable.createFromStream(inputStream, str);
             try{
                inputStream.close();
             }catch(java.io.IOException e0){
                e0+p0;
             }
             return uDrawable;
          }catch(java.io.FileNotFoundException e0){
             "Icon not found: "+p0+", "+e0.getMessage();
             return str;
          }
       }catch(java.io.FileNotFoundException e0){
       }
    }
    public Drawable q(Uri p0){
       int i1;
       String authority = p0.getAuthority();
       if (TextUtils.isEmpty(authority)) {
          throw new FileNotFoundException("No authority: "+p0);
       }
       try{
          Resources resourcesFor = this.e.getPackageManager().getResourcesForApplication(authority);
          List pathSegments = p0.getPathSegments();
          if (pathSegments == null) {
             throw new FileNotFoundException("No path: "+p0);
          }
          int i = pathSegments.size();
          if (i == 1) {
             try{
                i1 = Integer.parseInt(pathSegments.get(0));
             }catch(java.lang.NumberFormatException e0){
                throw new FileNotFoundException("Single path segment is not a resource ID: "+p0);
             }
          }else if(i == 2){
             i1 = resourcesFor.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
          }else {
             throw new FileNotFoundException("More than two path segments: "+p0);
          }
          if (i1) {
             return resourcesFor.getDrawable(i1);
          }else {
             throw new FileNotFoundException("No resource found for: "+p0);
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          throw new FileNotFoundException("No package found for authority: "+p0);
       }
    }
    public final Drawable r(String p0){
       try{
          if (p0 != null && (p0.isEmpty() || ("0").equals(p0))) {
          }else {
             int i = Integer.parseInt(p0);
             String str = "android.resource://"+this.q.getPackageName()+"/"+i;
             Drawable uDrawable = this.j(str);
             if (uDrawable != null) {
                return uDrawable;
             }
             Drawable drawable = ContextCompat.getDrawable(this.q, i);
             this.z(str, drawable);
             return drawable;
          }
       }catch(java.lang.NumberFormatException e0){
          Drawable uDrawable1 = this.j(p0);
          if (uDrawable1 != null) {
             return uDrawable1;
          }
          uDrawable1 = this.p(Uri.parse(p0));
          this.z(p0, uDrawable1);
       }catch(android.content.res.Resources$NotFoundException e0){
          return e0;
       }
    label_005a :
       return null;
    }
    public final Drawable s(Cursor p0){
       g tz = this.z;
       if (tz == -1) {
          return null;
       }
       Drawable uDrawable = this.r(p0.getString(tz));
       if (uDrawable != null) {
          return uDrawable;
       }
       return this.o();
    }
    public final Drawable t(Cursor p0){
       g tA = this.A;
       if (tA == -1) {
          return null;
       }
       return this.r(p0.getString(tA));
    }
    public Cursor u(SearchableInfo p0,String p1,int p2){
       Cursor uCursor = null;
       if (p0 == null) {
          return uCursor;
       }
       String suggestAutho = p0.getSuggestAuthority();
       if (suggestAutho == null) {
          return uCursor;
       }
       Uri$Builder uBuilder = new Uri$Builder().scheme("content").authority(suggestAutho).query("").fragment("");
       String suggestPath = p0.getSuggestPath();
       if (suggestPath != null) {
          uBuilder.appendEncodedPath(suggestPath);
       }
       uBuilder.appendPath("search_suggest_query");
       String suggestSelec = p0.getSuggestSelection();
       if (suggestSelec != null) {
          uCursor = new String[]{p1};
       }else {
          uBuilder.appendPath(p1);
       }
       Cursor uCursor1 = uCursor;
       if (p2 > 0) {
          uBuilder.appendQueryParameter("limit", String.valueOf(p2));
       }
       return this.e.getContentResolver().query(uBuilder.build(), null, suggestSelec, uCursor1, null);
    }
    public void w(int p0){
       this.u = p0;
    }
    public final void x(ImageView p0,Drawable p1,int p2){
       p0.setImageDrawable(p1);
       if (p1 == null) {
          p0.setVisibility(p2);
       }else {
          p0.setVisibility(0);
          p1.setVisible(0, 0);
          p1.setVisible(true, 0);
       }
       return;
    }
    public final void y(TextView p0,CharSequence p1){
       p0.setText(p1);
       if (TextUtils.isEmpty(p1)) {
          p0.setVisibility(8);
       }else {
          p0.setVisibility(0);
       }
       return;
    }
    public final void z(String p0,Drawable p1){
       if (p1 != null) {
          this.r.put(p0, p1.getConstantState());
       }
       return;
    }
}
