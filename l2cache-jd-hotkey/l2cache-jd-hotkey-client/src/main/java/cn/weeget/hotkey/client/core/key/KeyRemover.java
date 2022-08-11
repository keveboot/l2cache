package cn.weeget.hotkey.client.core.key;

import cn.weeget.hotkey.client.etcd.EtcdConfigFactory;
import cn.weeget.hotkey.client.log.JdLogger;

/**
 * 删除某个key
 * @author wuweifeng
 * @version 1.0
 * @date 2020-07-16
 */
public class KeyRemover {

    public static void remove(String key) {
        try {
            EtcdConfigFactory.configCenter().delete(key);
        } catch (Exception e) {
            JdLogger.error(KeyRemover.class, "remove key error");
        }
    }
}
