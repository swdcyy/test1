package kud.d;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.File;
import java.lang.String;

public interface abstract d implements FileFilter, FilenameFilter	// class@001c02
{

    boolean accept(File p0);
    boolean accept(File p0,String p1);
}
