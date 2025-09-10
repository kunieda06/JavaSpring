let rowCount = 0;

const addBtn = document.getElementById("addbtn");
const table = document.getElementById("tablePlan");
const tableBody = document.getElementById("tableBody");



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
    input.type = "text";
    input.placeholder = "予定の内容"
    inputCell.appendChild(input);





    newRow.appendChild(checkCell);
    newRow.appendChild(inputCell);

    tableBody.appendChild(newRow);
  rowCount++;
});