let rowCount = 0;

const addBtn = document.getElementById("addbtn");
const delBtn = document.getElementById("delbtn");
const table = document.getElementById("tablePlan");
const tableBody = document.getElementById("tableBody");

function updateRowCountDisplay(){
    const rowCountDisplay = document.getElementById("count");
    rowCountDisplay.textContent = `追加 件数：${rowCount}件`;
}

updateRowCountDisplay();

//追加ボタン
addBtn.addEventListener("click",()=>{
    if (rowCount === 0) {
        table.style.display = "table";
    }
    const newRow = document.createElement("tr");
    //チェックボックス
    const checkCell = document.createElement("td");
    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkCell.appendChild(checkbox);
    //予定の内容
    const inputCell = document.createElement("td");
    const input = document.createElement("input");
    input.type = "text";
    input.placeholder = "予定の内容"
    inputCell.appendChild(input);
    //判断内容
    const judgeCell = document.createElement("td");
    const judge = document.createElement("input");
    judge.type = "text";
    judge.readOnly = true;
    judge.placeholder = "判断内容"
    judgeCell.appendChild(judge);

    newRow.appendChild(checkCell);
    newRow.appendChild(inputCell);
    newRow.appendChild(judgeCell);

    tableBody.appendChild(newRow);
  rowCount++;
  updateRowCountDisplay();
});

//削除ボタン
delBtn.addEventListener("click",()=>{
    const rows = tableBody.querySelectorAll("tr");
    rows.forEach(row => {
        const checkbox = row.querySelector("input[type='checkbox']");
        if(checkbox && checkbox.checked){
            row.remove();
            rowCount--;
        }
    });
    if(rowCount===0){
        table.style.display = "none";
    }
    updateRowCountDisplay();
});