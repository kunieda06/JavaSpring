document.getElementById("btn").addEventListener("click", async () =>{
    const number = document.getElementById("number").value;
    const subnumber = document.getElementById("subnumber").value;
    const res = await fetch(`/api/product?number=${encodeURIComponent(number)}&subnumber=${encodeURIComponent(subnumber)}`);
    const data = await res.json();
    document.getElementById("result1").textContent = data.message1;
    document.getElementById("result2").textContent = data.message2;

    result1.classList.add("active");
    result2.classList.add("active");
})
