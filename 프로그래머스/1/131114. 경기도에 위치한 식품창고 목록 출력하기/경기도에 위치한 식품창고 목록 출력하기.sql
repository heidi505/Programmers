-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, ifnull(freezer_yn, "N") as freezer_yn
from food_warehouse
where substr(address, 1,2) = "경기"
order by warehouse_id asc;
