import model.Netease;

import java.io.*;

/**
 * 序列化测试
 *
 * @author zhangshenhao on 2018/07/18
 */
public class RunTest {
    public static void main(String[] args) throws Exception {
        //serializeNetease();
        Netease netease = deserializeNetease();
        System.out.println(netease.toString());

    }

    /**
     * 序列化
     */
    private static void serializeNetease() throws IOException {
        Netease netease = new Netease();
        netease.setColor("black");
        netease.setName("naruto");
        netease.setCar("0000");
        // ObjectOutputStream 对象输出流，将 netease 对象存储到E盘的 netease.txt 文件中，完成对 netease 对象的序列化操作
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\SerializableLearning\\SerializableLearning\\Netease.txt")));
        oos.writeObject(netease);
        System.out.println("netease 对象序列化成功！");
        oos.close();
    }

    /**
     * 反序列化
     */
    private static Netease deserializeNetease() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\SerializableLearning\\SerializableLearning\\Netease.txt")));
        Netease person = (Netease) ois.readObject();
        System.out.println("netease 对象反序列化成功！");
        return person;
    }
}
