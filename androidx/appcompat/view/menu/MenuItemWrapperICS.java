package androidx.appcompat.view.menu.MenuItemWrapperICS;
import android.view.MenuItem;
import v0.b;
import android.content.Context;
import t1.b;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.ActionProvider;
import a2.b;
import androidx.appcompat.view.menu.MenuItemWrapperICS$a;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.SubMenu;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.reflect.Method;
import androidx.appcompat.view.menu.MenuItemWrapperICS$b;
import android.view.CollapsibleActionView;
import android.view.MenuItem$OnActionExpandListener;
import androidx.appcompat.view.menu.MenuItemWrapperICS$c;
import android.view.MenuItem$OnMenuItemClickListener;
import androidx.appcompat.view.menu.MenuItemWrapperICS$d;

public class MenuItemWrapperICS extends b implements MenuItem	// class@00059f
{
    public final b d;
    public Method e;

    public void MenuItemWrapperICS(Context p0,b p1){
       super(p0);
       if (p1 == null) {
          throw new IllegalArgumentException("Wrapped Object can not be null.");
       }
       this.d = p1;
       return;
    }
    public boolean collapseActionView(){
       return this.d.collapseActionView();
    }
    public boolean expandActionView(){
       return this.d.expandActionView();
    }
    public ActionProvider getActionProvider(){
       b uob = this.d.b();
       if (uob instanceof MenuItemWrapperICS$a) {
          return uob.d;
       }
       return null;
    }
    public View getActionView(){
       View actionView = this.d.getActionView();
       if (actionView instanceof MenuItemWrapperICS$CollapsibleActionViewWrapper) {
          actionView = actionView.getWrappedView();
       }
       return actionView;
    }
    public int getAlphabeticModifiers(){
       return this.d.getAlphabeticModifiers();
    }
    public char getAlphabeticShortcut(){
       return this.d.getAlphabeticShortcut();
    }
    public CharSequence getContentDescription(){
       return this.d.getContentDescription();
    }
    public int getGroupId(){
       return this.d.getGroupId();
    }
    public Drawable getIcon(){
       return this.d.getIcon();
    }
    public ColorStateList getIconTintList(){
       return this.d.getIconTintList();
    }
    public PorterDuff$Mode getIconTintMode(){
       return this.d.getIconTintMode();
    }
    public Intent getIntent(){
       return this.d.getIntent();
    }
    public int getItemId(){
       return this.d.getItemId();
    }
    public ContextMenu$ContextMenuInfo getMenuInfo(){
       return this.d.getMenuInfo();
    }
    public int getNumericModifiers(){
       return this.d.getNumericModifiers();
    }
    public char getNumericShortcut(){
       return this.d.getNumericShortcut();
    }
    public int getOrder(){
       return this.d.getOrder();
    }
    public SubMenu getSubMenu(){
       return this.f(this.d.getSubMenu());
    }
    public CharSequence getTitle(){
       return this.d.getTitle();
    }
    public CharSequence getTitleCondensed(){
       return this.d.getTitleCondensed();
    }
    public CharSequence getTooltipText(){
       return this.d.getTooltipText();
    }
    public boolean hasSubMenu(){
       return this.d.hasSubMenu();
    }
    public boolean isActionViewExpanded(){
       return this.d.isActionViewExpanded();
    }
    public boolean isCheckable(){
       return this.d.isCheckable();
    }
    public boolean isChecked(){
       return this.d.isChecked();
    }
    public boolean isEnabled(){
       return this.d.isEnabled();
    }
    public boolean isVisible(){
       return this.d.isVisible();
    }
    public void j(boolean p0){
       try{
          int i = 1;
          if (this.e == null) {
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Boolean.TYPE;
             this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", uClassArray);
          }
          Object[] objArray = new Object[i];
          objArray[0] = Boolean.valueOf(p0);
          this.e.invoke(this.d, objArray);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public MenuItem setActionProvider(ActionProvider p0){
       MenuItemWrapperICS$b uob = new MenuItemWrapperICS$b(this, this.a, p0);
       MenuItemWrapperICS td = this.d;
       if (p0 != null) {
       }else {
          uob = null;
       }
       td.a(uob);
       return this;
    }
    public MenuItem setActionView(int p0){
       this.d.setActionView(p0);
       View actionView = this.d.getActionView();
       if (actionView instanceof CollapsibleActionView) {
          this.d.setActionView(new MenuItemWrapperICS$CollapsibleActionViewWrapper(actionView));
       }
       return this;
    }
    public MenuItem setActionView(View p0){
       MenuItemWrapperICS$CollapsibleActionViewWrapper uCollapsible;
       if (p0 instanceof CollapsibleActionView) {
          uCollapsible = new MenuItemWrapperICS$CollapsibleActionViewWrapper(p0);
       }
       this.d.setActionView(uCollapsible);
       return this;
    }
    public MenuItem setAlphabeticShortcut(char p0){
       this.d.setAlphabeticShortcut(p0);
       return this;
    }
    public MenuItem setAlphabeticShortcut(char p0,int p1){
       this.d.setAlphabeticShortcut(p0, p1);
       return this;
    }
    public MenuItem setCheckable(boolean p0){
       this.d.setCheckable(p0);
       return this;
    }
    public MenuItem setChecked(boolean p0){
       this.d.setChecked(p0);
       return this;
    }
    public MenuItem setContentDescription(CharSequence p0){
       this.d.setContentDescription(p0);
       return this;
    }
    public MenuItem setEnabled(boolean p0){
       this.d.setEnabled(p0);
       return this;
    }
    public MenuItem setIcon(int p0){
       this.d.setIcon(p0);
       return this;
    }
    public MenuItem setIcon(Drawable p0){
       this.d.setIcon(p0);
       return this;
    }
    public MenuItem setIconTintList(ColorStateList p0){
       this.d.setIconTintList(p0);
       return this;
    }
    public MenuItem setIconTintMode(PorterDuff$Mode p0){
       this.d.setIconTintMode(p0);
       return this;
    }
    public MenuItem setIntent(Intent p0){
       this.d.setIntent(p0);
       return this;
    }
    public MenuItem setNumericShortcut(char p0){
       this.d.setNumericShortcut(p0);
       return this;
    }
    public MenuItem setNumericShortcut(char p0,int p1){
       this.d.setNumericShortcut(p0, p1);
       return this;
    }
    public MenuItem setOnActionExpandListener(MenuItem$OnActionExpandListener p0){
       MenuItemWrapperICS td = this.d;
       MenuItemWrapperICS$c uoc = (p0 != null)? new MenuItemWrapperICS$c(this, p0): null;
       td.setOnActionExpandListener(uoc);
       return this;
    }
    public MenuItem setOnMenuItemClickListener(MenuItem$OnMenuItemClickListener p0){
       MenuItemWrapperICS td = this.d;
       MenuItemWrapperICS$d uod = (p0 != null)? new MenuItemWrapperICS$d(this, p0): null;
       td.setOnMenuItemClickListener(uod);
       return this;
    }
    public MenuItem setShortcut(char p0,char p1){
       this.d.setShortcut(p0, p1);
       return this;
    }
    public MenuItem setShortcut(char p0,char p1,int p2,int p3){
       this.d.setShortcut(p0, p1, p2, p3);
       return this;
    }
    public void setShowAsAction(int p0){
       this.d.setShowAsAction(p0);
    }
    public MenuItem setShowAsActionFlags(int p0){
       this.d.setShowAsActionFlags(p0);
       return this;
    }
    public MenuItem setTitle(int p0){
       this.d.setTitle(p0);
       return this;
    }
    public MenuItem setTitle(CharSequence p0){
       this.d.setTitle(p0);
       return this;
    }
    public MenuItem setTitleCondensed(CharSequence p0){
       this.d.setTitleCondensed(p0);
       return this;
    }
    public MenuItem setTooltipText(CharSequence p0){
       this.d.setTooltipText(p0);
       return this;
    }
    public MenuItem setVisible(boolean p0){
       return this.d.setVisible(p0);
    }
}
