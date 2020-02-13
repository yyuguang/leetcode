package com.lnzz.队列;

import java.util.LinkedList;
import java.util.List;

/**
 * ClassName：_933_最近的请求次数
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/13 10:49
 * @Description:
 */
public class _933_最近的请求次数 {
    /**
     * 写一个 RecentCounter 类来计算最近的请求。
     * 它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。
     * 返回从 3000 毫秒前到现在的 ping 数。
     * 任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。
     * 保证每次对 ping 的调用都使用比之前更大的 t 值。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-recent-calls
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 方法一
     */
    /*private List<Integer> list;

    private int minIndex = 0;

    public _933_最近的请求次数() {
        list = new LinkedList<>();
    }

    public int ping(int t) {
        list.add(t);
        for (int i = minIndex; i < list.size(); i++) {
            Integer item = list.get(i);
            if (item < t - 3000) {
                ++minIndex;
            } else {
                break;
            }
        }
        return list.size() - minIndex;
    }*/


    /**
     * 方法二
     */
    LinkedList<Integer> pingList;

    public _933_最近的请求次数() {
        pingList = new LinkedList<Integer>();
    }

    public int ping(int t) {
        pingList.add(t);
        while (t - 3000 > pingList.peek()) {
            pingList.poll();
        }
        return pingList.size();
    }

}
