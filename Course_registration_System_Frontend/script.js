function showCourses() {
    fetch("http://localhost:8080/courses")
        .then((response) => response.json())
        .then((courses) => {
            var table = document.getElementById("coursetable");

            courses.forEach(course => {
                var row = `
        <tr>
          <td>${course.courseId}</td>
          <td>${course.courseName}</td>
          <td>${course.trainer}</td>
          <td>${course.durationInWeeks}</td>
        </tr>`;

                table.innerHTML += row;
            });
        })
        .catch(err => console.error(err));
}
function enrolledCourses() {
    fetch("http://localhost:8080/course/registered")
        .then((response) => response.json())
        .then((enrolled) => {
            var table = document.getElementById("enrolledtable");

            enrolled.forEach(enroll => {
                var row = `
        <tr>
          <td>${enroll.id}</td>
          <td>${enroll.name}</td>
          <td>${enroll.coursename}</td>
          <td>${enroll.emailid}</td>
        </tr>`;

                table.innerHTML += row;
            });
        })
        .catch(err => console.error(err));
}
function getCourse() {
    fetch("http://localhost:8080/courses")
        .then((response) => response.json())
        .then((course) => {
            var id = document.getElementById("course");
            course.forEach(course => {
                var option = document.createElement("option");
                option.text = course.courseName;
                id.appendChild(option);
            });
        })
        .catch(err => console.error(err));
}