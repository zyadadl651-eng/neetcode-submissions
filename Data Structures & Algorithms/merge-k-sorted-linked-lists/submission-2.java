public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> nodes = new ArrayList<>();

        for (ListNode lst : lists) {
            while (lst != null) {
                nodes.add(lst);
                lst = lst.next;
            }
        }

        Collections.sort(nodes, (a, b) -> a.val - b.val);

        ListNode res = new ListNode(0);
        ListNode cur = res;

        for (ListNode node : nodes) {
            cur.next = node;
            cur = cur.next;
        }

        cur.next = null;

        return res.next;
    }
}