public class Solution {
public void setZeroes(ArrayList<ArrayList<Integer>> a) {
int row = a.size();
int col = 0;
if (row > 0)
{
col = a.get(0).size();
}
// this means a is empty
else{
return;
}
HashSet<Integer> row_list = new HashSet<>();
HashSet<Integer> col_list = new HashSet<>();
// This iteration is to get a list of all rows and column # to be changed
for (int i = 0; i < row; i++)
{
for (int j = 0; j < col; j++)
{
if (a.get(i).get(j) == 0)
{
row_list.add(i);
col_list.add(j);
}
}
}
// This iteration is to change the element the row and column derived above
for (int l = 0; l < row; l++)
{
for (int m = 0; m < col; m++)
{
if (row_list.contains(l) || col_list.contains(m))
{
a.get(l).set(m,0);
}
}
}
}
}
