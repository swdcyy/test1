package d6.b;
import d6.i;
import d6.j;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Iterator;
import d6.f;
import java.lang.reflect.Type;
import java.lang.Class;
import org.json.alipay.a;
import f6.a;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.EnumSet;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import d6.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;

public final class b implements i, j	// class@001e10
{

    public void b(){
       super();
    }
    public final Object a(Object p0){
       ArrayList uArrayList = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          uArrayList.add(f.b(p0.next()));
       }
       return uArrayList;
    }
    public final Object a(Object p0,Type p1){
       ArrayList uArrayList;
       if (!p0.getClass().equals(a.class)) {
          return null;
       }
       a uoa = a.a(p1);
       int i = 0;
       if (uoa == AbstractCollection.class) {
          uArrayList = new ArrayList();
       }else if(uoa.isAssignableFrom(HashSet.class)){
          uArrayList = new HashSet();
       }else if(uoa.isAssignableFrom(LinkedHashSet.class)){
          uArrayList = new LinkedHashSet();
       }else if(uoa.isAssignableFrom(TreeSet.class)){
          uArrayList = new TreeSet();
       }else if(uoa.isAssignableFrom(ArrayList.class)){
          uArrayList = new ArrayList();
       }else if(uoa.isAssignableFrom(EnumSet.class)){
          object oobject1 = (p1 instanceof ParameterizedType)? p1.getActualTypeArguments()[i]: Object.class;
          uArrayList = EnumSet.noneOf(oobject1);
       }else {
          try{
             uArrayList = uoa.newInstance();
          }catch(java.lang.Exception e0){
             throw new IllegalArgumentException("create instane error, class "+e0.getName());
          }
       }
       if (p1 instanceof ParameterizedType) {
          object oobject = p1.getActualTypeArguments()[i];
          for (; i < p0.a(); i = i + 1) {
             uArrayList.add(e.a(p0.a(i), oobject));
          }
          return uArrayList;
       }else {
          throw new IllegalArgumentException("Does not support the implement for generics.");
       }
    }
    public final boolean a(Class p0){
       return Collection.class.isAssignableFrom(p0);
    }
}
