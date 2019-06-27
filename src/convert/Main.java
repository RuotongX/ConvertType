package convert;
import java.io.File;

import javax.swing.JFrame;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        File.separator  　这是用你所用的系统默认的文件分割符
//        String path = "C:"+File.separator+"my.doc" ;
        
//        String path = "H:" + File.separator + "DriverBackup" + File.separator + "2019.6.23";
        //String path = "E:\\cc\\images\\Images";
//        String path = "E:/cc/images/Images";
//        String from = "CHK";
//        String to = "NEF";
//        suffixRename(path, from, to);
    	JFrame pp = new DisplayControl("Suffix");
    	pp.setVisible(true);
    }

    /**
     * 
     * @param path 要批量修改后缀名文件夹路径
     * @param from 源文件后缀名
     * @param to  修改后目标文件后缀名
     */
//    public static void suffixRename(String path, String from, String to) {
//        File file = new File(path);
//        File[] fs = file.listFiles();
//        for (int i = 0; i < fs.length; i++) {
//            File f2 = fs[i];
//            if (f2.isDirectory()) {
//                suffixRename(f2.getPath(), from, to);
//            } else {
//                String name = f2.getName();
//                if (name.endsWith(from)) {
//                    f2.renameTo(new File(f2.getParent() + File.separator 
//                            + name.substring(0, name.indexOf(from)) + to));
//                }
//            }
//        }
//    }

}
